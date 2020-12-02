package com.shangshufang.homework.step1.knowledge9001_14;

/**
 * Java循环结构-for循环
 */
public class Demo4 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 10000; i++) {
            if (i == 30 || i == 33) {
                continue;
            }
            if (i % 3 == 0) {
                result += i;
            }
        }
        System.out.println("从0到10000中(30,33跳过)，将能被3整除的数求和的结果为：" + result);
    }
}