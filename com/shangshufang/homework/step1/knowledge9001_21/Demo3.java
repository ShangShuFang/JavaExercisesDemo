package com.shangshufang.homework.step1.knowledge9001_21;

/**
 * Java方法-将数组作为参数传递
 */
public class Demo3 {
    public static void main(String[] args) {
        double[] arr = new double[5];
        arr[0] = 120.50;
        arr[1] = 121.50;
        arr[2] = 122.50;
        arr[3] = 123.50;
        arr[4] = 124.50;

        System.out.println("修改数组前：");
        for (double value : arr) {
            System.out.println(value);
        }

        fixArray(arr, 2, 132.50);
        
        System.out.println("修改数组后：");
        for (double value : arr) {
            System.out.println(value);
        }
    }

    /**
     * 修改数组的
     * @param arr 数组
     * @param index 数组下表
     * @param value 修改的值
     */
    static void fixArray(double[] arr, int index, double value) {
        arr[index] = value;
    }
}