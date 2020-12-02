package com.shangshufang.homework.step1.knowledge9001_22;

/**
 * Java方法-将数组作为返回值
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        System.out.println("倒序前：");
        for (int value : arr) {
            System.out.println(value);
        }

        int[] reverseArr = reverse(arr);

        System.out.println("倒序后：");
        for (int value : reverseArr) {
            System.out.println(value);
        }
    }

    /**
     * 修改数组的
     * @param arr 数组
     */
    static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0, j = result.length - 1; i < arr.length; i++, j--) {
            result[j] = arr[i];
        }
        return result;
    }
}