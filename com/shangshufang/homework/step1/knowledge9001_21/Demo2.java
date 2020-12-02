package com.shangshufang.homework.step1.knowledge9001_21;

/**
 * Java方法-将数组作为参数传递
 */
public class Demo2 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = "A";
        arr[1] = "B";
        arr[2] = "C";
        arr[3] = "D";
        arr[4] = "E";

        System.out.println("修改数组前：");
        for (String value : arr) {
            System.out.println(value);
        }

        fixArray(arr, 1, "b");
        
        System.out.println("修改数组后：");
        for (String value : arr) {
            System.out.println(value);
        }
    }

    /**
     * 修改数组的
     * @param arr 数组
     * @param index 数组下表
     * @param value 修改的值
     */
    static void fixArray(String[] arr, int index, String value) {
        arr[index] = value;
    }
}