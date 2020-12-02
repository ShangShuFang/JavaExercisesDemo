package com.shangshufang.homework.step1.knowledge9001_20;

/**
 * Java方法-void关键字及按值传参
 */
public class Demo2 {
    public static void main(String[] args) {
        String str = "Johnny";
        System.out.println("传入方法修改前的字符串为：" + str);
        fixString(str);
        System.out.println("经过方法修改后的字符串为：" + str);
        
    }

    /**
     * 改变参数的内容（字符串）
     * @param str 字符串
     */
    static void fixString(String str) {
        str = "hi" + " " + str;
        System.out.println("在方法内修改字符串后的内容为：" + str);
    }
}