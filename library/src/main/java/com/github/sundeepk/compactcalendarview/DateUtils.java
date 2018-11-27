package com.github.sundeepk.compactcalendarview;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static boolean onCurrentMonth(Date calendarDate) {
        Calendar currentMonth = Calendar.getInstance();
        currentMonth.setTime(new Date());
        Calendar calendarMonth = Calendar.getInstance();
        calendarMonth.setTime(calendarDate);
        return currentMonth.get(Calendar.YEAR) == calendarMonth.get(Calendar.YEAR) && currentMonth.get(Calendar.MONTH) == calendarMonth.get(Calendar.MONTH);
    }

}
