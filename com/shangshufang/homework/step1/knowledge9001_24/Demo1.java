package com.shangshufang.homework.step1.knowledge9001_24;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {50, 29, 38, 21, 17, 9, 5, 31};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
