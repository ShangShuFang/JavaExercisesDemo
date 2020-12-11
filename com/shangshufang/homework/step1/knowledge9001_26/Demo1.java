package com.shangshufang.homework.step1.knowledge9001_26;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date date = new Date();
        var year = date.getYear() + 1900;
        var month = date.getMonth() + 1;
        var day = date.getDate();
        var hour = date.getHours();
        var minute = date.getMinutes();
        var seconds = date.getSeconds();

        System.out.println("年: " + year);
        System.out.println("月: " + month);
        System.out.println("日: " + day);
        System.out.println("时: " + hour);
        System.out.println("分: " + minute);
        System.out.println("秒: " + seconds);
    }

    private static void println(Object s) {
        System.out.println(s);
    }
}
