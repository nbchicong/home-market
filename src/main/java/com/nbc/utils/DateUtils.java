package com.nbc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateUtils {
  public static final String VIETNAM_DATE_PATTERN = "dd/MM/yyyy";
  public static final String VIETNAM_DATETIME_PATTERN = "dd/MM/yyyy HH:mm:ss";

  public static Date getDate(String text, String pattern) {
    SimpleDateFormat formatter = new SimpleDateFormat(pattern);
    try {
      return formatter.parse(text);
    } catch (ParseException e) {
      e.printStackTrace();
    }

    return null;
  }

  public static long daysBetween(Date start, Date end) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(start);
    calendar.set(Calendar.HOUR_OF_DAY, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 1);

    long time1 = calendar.getTimeInMillis();

    calendar.setTime(end);
    calendar.set(Calendar.HOUR_OF_DAY, 23);
    calendar.set(Calendar.MINUTE, 59);
    calendar.set(Calendar.SECOND, 59);

    long time2 = calendar.getTimeInMillis();

    long diff = time2 - time1;

    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) + 1;
  }
}
