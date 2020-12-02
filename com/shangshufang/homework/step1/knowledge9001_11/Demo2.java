package com.shangshufang.homework.step1.knowledge9001_11;

/**
 * Java运算符-条件运算符（三元运算符）
 */
public class Demo2 {
    public static void main(String[] args) {
        float entryScore4Undergraduate = 451;
        float examScore = 369;
        String result = examScore > entryScore4Undergraduate ? "通过一本录取分数线" : "未通过一本录取分数线";

        System.out.println("您的高考总分: " + examScore);
        System.out.println("第一批本科录取分数线: " + entryScore4Undergraduate);
        System.out.println("高考结果: " + result);
    }
}