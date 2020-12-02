package com.shangshufang.homework.step1.knowledge9001_11;
/**
 * Java运算符-条件运算符（三元运算符）
 */
public class Demo1 {
    public static void main(String[] args) {
        float secondBatchesScore = 350;
        float examScore = 369;

        String result = examScore > secondBatchesScore ? "通过本科录取分数线" : "未通过本科录取分数线";

        System.out.println("您的高考总分: " + examScore);
        System.out.println("第二批本科录取分数线: " + secondBatchesScore);
        System.out.println("高考结果: " + result);
    }
}