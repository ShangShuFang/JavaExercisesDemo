package com.shangshufang.homework.step1.knowledge9001_32;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        Reader reader = null;
        BufferedReader bufferedReader = null;
        String logPath = "/Users/zhangqiang/Downloads/temp/test.log";
        try {
            inputStream = new FileInputStream(logPath);
            reader = new InputStreamReader(inputStream, "UTF-8");
            bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (reader != null) {
                    reader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
