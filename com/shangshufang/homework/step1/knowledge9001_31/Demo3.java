package com.shangshufang.homework.step1.knowledge9001_31;

import java.io.File;

/**
 * 使用File类创建子目录
 */
public class Demo3 {
    public static void main(String[] args) {
        String dir = "/Users/zhangqiang/Downloads/temp";
        String subDir1 = "/A/B";
        String subDir2 = "/C";
        String newDir1 = dir + subDir1;
        String newDir2 = dir + subDir2;

        File file1 = new File(newDir1);
        boolean result1 = file1.mkdirs();

        File file2 = new File(newDir2);
        boolean result2 = file2.mkdir();

        String message1 = result1 ? "目录1创建成功" : "目录1创建失败";
        String message2 = result2 ? "目录2创建成功" : "目录2创建失败";

        System.out.println(message1);
        System.out.println(message2);
    }
}
