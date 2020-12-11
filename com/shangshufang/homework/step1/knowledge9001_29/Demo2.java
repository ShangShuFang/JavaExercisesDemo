package com.shangshufang.homework.step1.knowledge9001_29;
import java.time.*;

public class Demo2 {
    public static void main(String[] args) {
        // 指定日期和时间:
        LocalDate localDate = LocalDate.of(2020, 11, 15); // 2019-11-30, 注意11=11月
        LocalTime localTime = LocalTime.of(10, 30, 30); // 15:16:17
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 11, 15, 10, 30, 30);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);

        System.out.println(localDate.toString());
        System.out.println(localTime.toString());
        System.out.println(localDateTime1.toString());
        System.out.println(localDateTime2.toString());
    }
}
