package com.shangshufang.homework.step1.knowledge9001_15;

/**
 * Java循环结构-while循环
 */
public class Demo1 {
    public static void main(String[] args) {
        int maxNum = 30;
        int result = 0;
        while (maxNum > 0) {
            if (maxNum % 2 == 0) {
                result += maxNum;
            }
            maxNum--;
        }
        System.out.println("1到30之间的所有偶数的和是：" + result);
    }
}