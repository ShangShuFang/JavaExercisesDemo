package com.shangshufang.homework.step1.knowledge9001_11;

/**
 * Java运算符-条件运算符（三元运算符）
 */
public class Demo3 {
    public static void main(String[] args) {
        int entryScore4Undergraduate = 689;
        float examScore = 710;
        String result = examScore > entryScore4Undergraduate ? "通过清华录取分数线" : "未通过清华录取分数线";

        System.out.println("您的高考总分: " + examScore);
        System.out.println("清华录取分数线: " + entryScore4Undergraduate);
        System.out.println("高考结果: " + result);
    }
}