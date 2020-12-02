package com.shangshufang.homework.step1.knowledge9001_13;

/**
 * Java条件语句-switch case
 */
public class Demo1 {
    public static void main(String[] args) {
        String sex = "F";
        switch (sex) {
            case "M":
                System.out.println("这个是小哥哥");
                break;
            case "F":
                System.out.println("这个是小姐姐");
                break;
            default:
                System.out.println("这个...不知道啊");
        }
    }
}