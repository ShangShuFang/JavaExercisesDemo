package com.shangshufang.homework.step1.knowledge9001_14;

/**
 * Java循环结构-for循环
 */
public class Demo2 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i == 40 || i == 48) {
                continue;
            }
            if (result >= 25000) {
                break;
            }
            if (i % 2 == 0) {
                result += i;
            }
        }
        System.out.println("0到1000之间(40,48跳过，大于等于25000跳出)偶数的和为：" + result);
    }
}