package com.shangshufang.homework.step1.knowledge9001_23;

/**
 * Java方法-方法的重载
 */
public class Demo1 {
    public static void main(String[] args) {
        int maxNum1 = max(6, 12);
        System.out.println("6, 12的最大值为：" + maxNum1);
        int maxNum2 = max(6, 12, 10);
        System.out.println("6, 12, 10的最大值为：" + maxNum2);
        double maxNum3 = max(19.35, 28.99, 65.99);
        System.out.println("19.35, 28.99, 65.99的最大值为：" + maxNum3);
        double maxNum4 = max(9.58, 18.65);
        System.out.println("9.58, 18.65的最大值为：" + maxNum4);
    }

    /**
     * 取得两个整型的最大值
     * @param num1 数值1
     * @param num2 数值2
     * @return 两个整型的最大值
     */
    static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    /**
     * 取得两个整型的最大值
     * @param num1 数值1
     * @param num2 数值2
     * @param num3 数值3
     * @return 三个整型的最大值
     */
    static int max(int num1, int num2, int num3) {
        int temp = num1 > num2 ? num1 : num2;
        return temp > num3 ? temp : num3;
    }

    /**
     * 取得两个双精度型的最大值
     * @param num1 数值1
     * @param num2 数值2
     * @return 两个整型的最大值
     */
    static double max(double num1, double num2) {
        return num1 > num2 ? num1 : num2;
    }

     /**
     * 取得三个双精度型的最大值
     * @param num1 数值1
     * @param num2 数值2
     * @param num3 数值3
     * @return 三个整型的最大值
     */
    static double max(double num1, double num2, double num3) {
        double temp = num1 > num2 ? num1 : num2;
        return temp > num3 ? temp : num3;
    }
}