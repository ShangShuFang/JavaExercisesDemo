package com.shangshufang.homework.step1.knowledge9001_30;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo1 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(dt));
    }
}
