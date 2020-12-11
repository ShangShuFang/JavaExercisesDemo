package com.shangshufang.homework.step1.knowledge9001_28;

import java.util.Calendar;

public class Demo1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = 1 + c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int seconds = c.get(Calendar.SECOND);

        System.out.println("年: " + year);
        System.out.println("月: " + month);
        System.out.println("日: " + day);
        System.out.println("时: " + hour);
        System.out.println("分: " + minute);
        System.out.println("秒: " + seconds);
    }
}
