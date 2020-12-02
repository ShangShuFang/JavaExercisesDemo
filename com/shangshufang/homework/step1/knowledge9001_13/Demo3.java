package com.shangshufang.homework.step1.knowledge9001_13;
/**
 * Java条件语句-switch case
 */
public class Demo3 {
    public static void main(String[] args) {
        String level = "C";
        switch (level) {
            case "A":
                System.out.println("成绩优秀");
                break;
            case "B":
            case "C":
                System.out.println("成绩良好");
                break;
            case "D":
                System.out.println("成绩及格");
                break;
            default:
                System.out.println("这个...不知道啊");
        }
    }
}