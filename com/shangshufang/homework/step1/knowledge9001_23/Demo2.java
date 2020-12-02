package com.shangshufang.homework.step1.knowledge9001_23;

/**
 * Java方法-方法的重载
 */
public class Demo2 {
    public static void main(String[] args) {
        welcome("终南山", "院士");
        welcome("终南山", "先生", "祝您身体健康");
    }

    static void welcome(String fullName, String title) {
        System.out.println(fullName + title + "您辛苦了");
    }

    static void welcome(String fullName, String title, String content) {
        System.out.println(fullName + title + content);
    }
}