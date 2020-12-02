package com.shangshufang.homework.step1.knowledge9001_19;

/**
 * Java方法-方法的定义与调用
 */
public class Demo3 {
    public static void main(String[] args) {
        float score1 = 92.5F;
        float score2 = 87F;
        float score3 = 78.5F;

        System.out.println(score1 + "对应的等级为：" + getGrade(score1));
        System.out.println(score2 + "对应的等级为：" + getGrade(score2));
        System.out.println(score3 + "对应的等级为：" + getGrade(score3));
    }

    /**
     * 根据分数，反馈所属级别
    * @param score 分数
    * @return 所属登记
    */
    static String getGrade(float score) {
        String grade = "";
        if (score >= 90.0) {
            grade = "A";
        }
        else if (score >= 80.0) {
            grade = "B";
        }
        else if (score >= 70.0) {
            grade = "C";
        }
        else if (score >= 60.0) {
            grade = "D";
        }
        else {
            grade = "E";
        }
        return grade;
    }
}