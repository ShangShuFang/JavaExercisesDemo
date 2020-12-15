package com.shangshufang.homework.step1.knowledge9001_31;


import java.io.File;

/**
 * 使用File类创建文件
 */
public class Demo1 {
    public static void main(String[] args) {
        try {
            String fileName = "test.log";
            File f1 = new File(".");
            String filePath = f1.getCanonicalPath() + File.separator + fileName;
            File file = new File(filePath);
            boolean result = file.createNewFile();
            if (result) {
                System.out.println(String.format("文件创建成功，文件地址：%s", filePath));
            } else {
                System.out.println("文件创建失败");
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
