package com.shangshufang.homework.step2.knowledge9002_02.demo3;

/**
 * Java面向对象-类与对象-静态方法
 */
public class Animal {
    private static final String pre = "一支漂亮的";
    public static void eat(String name) {
        System.out.println(pre + name + "正在吃东西");
    }
    
    public static void eat(String name, String food) {
        System.out.println(pre + name + "正在吃" + food);
    }

    public static void run(String name) {
        System.out.println(pre + name + "正在奔跑");
    }

    public static void run(String name, String direction) {
        System.out.println(pre + name + "正在向" + direction + "奔跑");
    }
}