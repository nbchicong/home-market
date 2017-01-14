package com.nbc.utils;

/**
 * NumberUtils
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: NumberUtils.java Jan 14, 2017 00:56:59 nbccong $
 * @since 1.0
 */
public class NumberUtils {
  public static boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
    } catch(NumberFormatException e) {
      return false;
    } catch(NullPointerException e) {
      return false;
    }
    return true;
  }

  public static boolean isLong(String s) {
    try {
      Long.parseLong(s);
    } catch(NumberFormatException e) {
      return false;
    } catch(NullPointerException e) {
      return false;
    }
    return true;
  }

  public static boolean isFloat(String s) {
    try {
      Float.parseFloat(s);
    } catch(NumberFormatException e) {
      return false;
    } catch(NullPointerException e) {
      return false;
    }
    return true;
  }

  public static boolean isBoolean(String s) {
    try {
      Boolean.parseBoolean(s);
    } catch(NumberFormatException e) {
      return false;
    } catch(NullPointerException e) {
      return false;
    }
    return true;
  }
}
