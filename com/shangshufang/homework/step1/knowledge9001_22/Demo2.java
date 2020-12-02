package com.shangshufang.homework.step1.knowledge9001_22;

/**
 * Java方法-将数组作为参数传递
 */
public class Demo2 {
    public static void main(String[] args) {
        String[] arr1 = new String[5];
        String[] arr2 = new String[5];
        arr1[0] = "A";
        arr1[1] = "B";
        arr1[2] = "C";
        arr1[3] = "D";
        arr1[4] = "E";

        arr2[0] = "a";
        arr2[1] = "b";
        arr2[2] = "c";
        arr2[3] = "d";
        arr2[4] = "e";

        String[] mergeArr = merge(arr1, arr2);

        System.out.println("合并后：");
        for (String value : mergeArr) {
            System.out.println(value);
        }
    }

    /**
     * 修改数组的
     * @param arr1 数组1
     * @param arr2 数组1
     */
    static String[] merge(String[] arr1, String[] arr2) {
        String[] arr = new String[arr1.length + arr2.length];
        int index = 0;
        for (String value : arr1) {
            arr[index] = value;
            index++;
        }
        for (String value : arr2) {
            arr[index] = value;
            index++;
        }
        return arr;
    }
}