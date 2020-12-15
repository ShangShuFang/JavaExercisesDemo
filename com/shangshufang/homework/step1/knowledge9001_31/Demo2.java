package com.shangshufang.homework.step1.knowledge9001_31;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 列出指定目录中所有文件和子目录
 */
public class Demo2 {
    public static void main(String[] args) {
        String path = "/Users/zhangqiang/Documents/03-樱桃谷/02-项目文档/ShangShuFang/dbscripts/change data";

        File file = new File(path);
        String[] dirList = file.list();
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".sql");
            }
        });

        if (dirList != null) {
            System.out.println("dir: ");
            for (String dir : dirList) {
                System.out.println(dir);
            }
        }
        
        if (files != null) {
            System.out.println("file: ");
            for (File f : files) {
                System.out.println(f);
            }
        }
    }
}
