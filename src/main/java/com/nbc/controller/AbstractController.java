package com.nbc.controller;

import com.nbc.utils.DateUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public abstract class AbstractController {
  /**
   * @param request
   * @param name
   * @return
   */
  public String getString(HttpServletRequest request, String name) {
    return request.getParameter(name);
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
}
