package com.shangshufang.homework.step1.knowledge9001_27;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
        var date = new Date();
        var sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}
