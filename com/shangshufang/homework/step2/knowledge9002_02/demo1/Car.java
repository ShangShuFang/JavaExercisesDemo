package com.shangshufang.homework.step2.knowledge9002_02.demo1;

/**
 * Java面向对象-类与对象-静态方法
 */
public class Car {
    private static final String pre = "一辆";
    public static void travel(String name) {
        System.out.println(pre + name + "正在行驶");
    }

    public static void travel(String name, int speed) {
        System.out.println(pre + name + "正在以" + speed + "公里的速度行驶");
    }
}