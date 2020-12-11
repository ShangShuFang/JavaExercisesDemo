package com.shangshufang.homework.step1.knowledge9001_28;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Demo2 {
    public static void main(String[] args) {
        // 当前时间:
        Calendar c = Calendar.getInstance();
        // 清除所有:
        c.clear();
        // 设置2020年:
        c.set(Calendar.YEAR, 2020);
        // 设置12月:注意11表示12月:
        c.set(Calendar.MONTH, 11);
        // 设置10日:
        c.set(Calendar.DATE, 10);
        // 设置时间:
        c.set(Calendar.HOUR_OF_DAY, 10);
        c.set(Calendar.MINUTE, 30);
        c.set(Calendar.SECOND, 0);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
    }
}
