package com.shangshufang.homework.step1.knowledge9001_14;

/**
 * Java循环结构-for循环
 */
public class Demo3 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i == 31 || i == 33) {
                continue;
            }
            if (result >= 24000) {
                break;
            }
            if (i % 2 == 1) {
                result += i;
            }
        }
        System.out.println("0到1000(31,33跳过，大于等于24000跳出)之间奇数的和为：" + result);
    }
}