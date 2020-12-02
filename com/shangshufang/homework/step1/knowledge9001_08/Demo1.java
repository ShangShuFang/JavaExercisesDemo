package com.shangshufang.homework.step1.knowledge9001_08;

/**
 * Java数据类型转换-强制类型转换
 */
public class Demo1 {
    public static void main(String[] args) {
        int i = 125;
        byte b = (byte)i;

        double d = 165.99508159;
        float f = (float)d;

        System.out.println("将int变量（125）强制类型转换为byte后的值为：" + b);

        System.out.println("将double变量（165.99508159）强制类型转换为float后的值为：" + f);
    }
}