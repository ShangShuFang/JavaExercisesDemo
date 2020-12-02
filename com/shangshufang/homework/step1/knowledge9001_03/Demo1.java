package com.shangshufang.homework.step1.knowledge9001_03;

/**
 * Java运算符-算术运算符
 */
public class Demo1 {
    public static void main(String[] args) {
        //语文成绩
        int chineseScore = 121;
        //数学成绩
        int mathScore = 115;
        //英语成绩
        float englishScore = 96.5F;
        //理综成绩
        float comprehensiveScore = 228.5F;
        //总分
        float totalScore = chineseScore + mathScore + englishScore + comprehensiveScore;

        System.out.println("这位同学的总分为：" + totalScore);
    }
}