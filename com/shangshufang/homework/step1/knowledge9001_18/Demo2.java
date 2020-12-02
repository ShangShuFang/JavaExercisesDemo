package com.shangshufang.homework.step1.knowledge9001_18;

/**
 * Java数组-For...Each 循环
 */
public class Demo2 {
    public static void main(String[] args) {
        int number = 30;
        int[] evenNumberArray = new int[12];
        int index = 0;
        int sum = 0;
        while (number >= 0) {
            if (index > 11) {
                break;
            }
            if (number % 2 == 0) {
                evenNumberArray[index] = number;
                index++;
            }
            number--;
        }

        for (int even : evenNumberArray) {
            sum += even;
        }

        System.out.println("30以内从大到小的前12个偶数的合计为：" + sum);
    }
}