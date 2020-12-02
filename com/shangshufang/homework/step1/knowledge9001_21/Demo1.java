package com.shangshufang.homework.step1.knowledge9001_21;

/**
 * Java方法-将数组作为参数传递
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 12;
        arr[3] = 13;
        arr[4] = 14;

        System.out.println("修改数组前：");
        for (int value : arr) {
            System.out.println(value);
        }

        fixArray(arr, 1, 21);
        
        System.out.println("修改数组后：");
        for (int value : arr) {
            System.out.println(value);
        }
    }

    /**
     * 修改数组的
     * @param arr 数组
     * @param index 数组下表
     * @param number 修改的值
     */
    static void fixArray(int[] arr, int index, int number) {
        arr[index] = number;
    }
}