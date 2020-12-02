package com.shangshufang.homework.step1.knowledge9001_12;
/**
 * Java条件语句-if...else
 */
public class Demo3 {
    public static void main(String[] args) {
        final int excellentScore = 90;
        final int goodScore = 80;
        final int generalScore = 70;
        final int passScore = 60;

        int score = 75;

        if (score >= excellentScore) {
            System.out.println("成绩级别：优秀");
        } else if (score >= goodScore) {
            System.out.println("成绩级别：良好");
        } else if (score >= generalScore) {
            System.out.println("成绩级别：普通");
        } else if (score >= passScore) {
            System.out.println("成绩级别：及格");
        } else {
            System.out.println("成绩级别：未及格");
        }
    }
}