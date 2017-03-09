package com.nbc.controller;

import com.nbc.utils.DateUtils;
import com.nbc.utils.NumberUtils;
import org.apache.log4j.Logger;
import org.bson.types.ObjectId;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.Date;

public abstract class AbstractController<T> {
  protected static final Logger logger = Logger.getLogger(AbstractController.class);
  /**
   * @param request
   * @param name
   * @return
   */
  public String getString(HttpServletRequest request, String name) {
    return request.getParameter(name);
  }

  public ObjectId getObjectId(HttpServletRequest request, String name) {
    return new ObjectId(getString(request, name));
  }

  /**
   * @param request
   * @param name
   * @return
   */
  public Integer getInt(HttpServletRequest request, String name) {
    String text = request.getParameter(name);
    if (StringUtils.hasLength(text)) {
      try {
        return Integer.valueOf(text);
      } catch (NumberFormatException ex) {
      }
    }

    return null;
  }

  /**
   * @param request
   * @param name
   * @param defaultValue
   * @return
   */
  public int getInt(HttpServletRequest request, String name, int defaultValue) {
    String text = request.getParameter(name);
    if (StringUtils.hasLength(text)) {
      try {
        return Integer.valueOf(text);
      } catch (NumberFormatException ex) {
      }
    }

    return defaultValue;
  }

  /**
   * @param request
   * @param name
   * @param defaultValue
   * @return
   */
  public long getLong(HttpServletRequest request, String name, long defaultValue) {
    String text = request.getParameter(name);
    System.out.println("Get Long");
    if (StringUtils.hasLength(text)) {
      try {
        return Integer.valueOf(text);
      } catch (NumberFormatException ex) {
      }
    }

    return defaultValue;
  }

  /**
   * @param request
   * @param name
   * @param defaultValue
   * @return
   */
  public boolean getBoolean(HttpServletRequest request, String name, boolean defaultValue) {
    String value = request.getParameter(name);
    if (StringUtils.hasLength(value)) {
      try {
        return Boolean.valueOf(value);
      } catch (Exception ex) {
      }
    }

    return defaultValue;
  }


  /**
   * @param request
   * @param name
   * @param defaultValue
   * @return
   */
  public float getFloat(HttpServletRequest request, String name, float defaultValue) {
    String text = request.getParameter(name);
    if (StringUtils.hasLength(text)) {
      try {
        return Float.valueOf(text);
      } catch (NumberFormatException ex) {
      }
    }

    return defaultValue;
  }

  /**
   * @param request
   * @param name
   * @return
   */
  public Date getDate(HttpServletRequest request, String name) {
    return getDate(request, name, DateUtils.VIETNAM_DATE_PATTERN);
  }

  /**
   * @param request
   * @param name
   * @param pattern
   * @return
   */
  public Date getDate(HttpServletRequest request, String name, String pattern) {
    String text = request.getParameter(name);
    if (StringUtils.hasLength(text)) {
      return DateUtils.getDate(text, pattern);
    }

    return null;
  }

  @SuppressWarnings("unchecked")
  protected T getModel(HttpServletRequest request, Class<T> model) {
    try {
      Class<?> clazzName = Class.forName(model.getSimpleName());
      Object instance = clazzName.newInstance();
      Class<?> clazz = instance.getClass();
      Field[] fields = model.getDeclaredFields();
      for (Field item : fields) {
        while (clazz != null) {
          try {
            String fieldName = item.getName();
            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(instance, getValue(request, fieldName));
          } catch (NoSuchFieldException e) {
            clazz = clazz.getSuperclass();
          } catch (Exception e) {
            throw new IllegalStateException(e);
          }
        }
      }
      return (T) instance;
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    }
    return null;
  }

  private Object getValue(HttpServletRequest request, String name) {
    String tmpValue = getString(request, name);
    if (name.equals("id"))
      return getObjectId(request, name);
    else if (NumberUtils.isInteger(tmpValue))
      return getInt(request, name);
    else if (NumberUtils.isLong(tmpValue))
      return getLong(request, name, 0L);
    else if (NumberUtils.isFloat(tmpValue))
      return getFloat(request, name, 0F);
    else if (NumberUtils.isBoolean(tmpValue))
      return getBoolean(request, name, false);
    return null;
  }
}
