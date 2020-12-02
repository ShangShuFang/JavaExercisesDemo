package com.shangshufang.homework.step1.knowledge9001_14;

/**
 * Java循环结构-for循环
 */
public class Demo1 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            if (i == 50 || i == 52) {
                continue;
            }
            if (result >= 4600) {
                break;
            }
            result += i;
        }
        System.out.println("从1加到100(50,52跳过，大于等于4600跳出)的结果是：" + result);
    }
}