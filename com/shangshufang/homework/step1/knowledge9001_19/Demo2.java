package com.shangshufang.homework.step1.knowledge9001_19;

/**
 * Java方法-方法的定义与调用
 */
public class Demo2 {
    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 30;
        int maxNumber = getMaxNumber(number1, number2);

        System.out.println("最大值为：" + maxNumber);
    }

    /**
     * 取得两个数最大的数
     * @param num1 数字1
     * @param num2 数字2
     * @return 反馈两个数最大的数
     */
    static int getMaxNumber(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}