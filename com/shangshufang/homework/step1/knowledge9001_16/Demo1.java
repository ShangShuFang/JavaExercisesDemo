package com.shangshufang.homework.step1.knowledge9001_16;

/**
 * Java循环结构-do...while循环
 */
public class Demo1 {
    public static void main(String[] args) {
        int maxNum = 30;
        int result = 0;
        do {
            if (maxNum % 2 == 0) {
                result += maxNum;
            }
            maxNum--;
        } while (maxNum > 0);
        System.out.println("1到30之间的所有偶数的和是：" + result);
    }
}