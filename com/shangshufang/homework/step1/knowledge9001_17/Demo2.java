package com.shangshufang.homework.step1.knowledge9001_17;

/**
 * Java数组-创建、初始化及取值
 */
public class Demo2 {
    public static void main(String[] args) {
        int number = 30;
        int[] evenNumberArray = new int[12];
        int index = 0;
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

        System.out.println("30以内从大到小的前12个偶数为：");
        for (int i = 0; i < 12; i++) {
            System.out.println(evenNumberArray[i]);
        }
    }
}