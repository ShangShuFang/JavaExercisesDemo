package com.shangshufang.homework.step1.knowledge9001_33;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Demo1 {
	public static void main(String[] args) {
		final String logPath = "/Users/zhangqiang/Downloads/temp/test.log";
		try (OutputStream output = new FileOutputStream(logPath)) {
			output.write("Hello world".getBytes("UTF-8"));
			System.out.println("已将Hello world写入文件");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
