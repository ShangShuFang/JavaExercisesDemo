package com.shangshufang.homework.step1.knowledge9001_16;

/**
 * Java循环结构-do...while循环
 */
public class Demo2 {
    public static void main(String[] args) {
        int result = 0;
        int number = 1;
        do {
            if (number == 50 || number == 52) {
                number++;
                continue;
            }
            if (result >= 4600) {
                break;
            }
            result += number;
            number++;
        } while (number <= 100);
        System.out.println("从1加到100(50,52跳过，大于等于4600跳出)的结果是：" + result);
    }
}