package com.shangshufang.homework.step1.knowledge9001_08;

/**
 * Java数据类型转换-强制类型转换
 */
public class Demo3 {
    public static void main(String[] args) {
        long l = 922337203685L;
        int i = (int)l;

        System.out.println("将long变量（922337203685）强制类型转换为int后的值为：" + i);
    }
}