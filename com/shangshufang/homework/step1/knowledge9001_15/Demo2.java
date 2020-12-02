package com.shangshufang.homework.step1.knowledge9001_15;

/**
 * Java循环结构-while循环
 */
public class Demo2 {
    public static void main(String[] args) {
        int result = 0;
        int number = 1;
        while (number <= 100 ) {
            if (number == 50 || number == 52) {
                number++;
                continue;
            }
            if (result >= 4600) {
                break;
            }
            result += number;
            number++;
        }
        System.out.println("从1到100(50,52跳过，大于等于4600跳出)之间数字的合计结果是：" + result);
    }
}