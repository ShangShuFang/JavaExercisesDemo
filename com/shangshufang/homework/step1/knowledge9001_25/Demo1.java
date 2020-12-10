package com.shangshufang.homework.step1.knowledge9001_25;

public class Demo1 {
    public static void main(String[] args) {
        try {
            String param = args[0];
            int num1 = 10;
            int num2 = Integer.parseInt(param);
            int sum = num1 + num2;
            System.out.println(sum);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
