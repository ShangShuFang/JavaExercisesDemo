package com.shangshufang.homework.step1.knowledge9001_35;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Demo3 {
	public static void main(String[] args) {
		final String file = "/Users/zhangqiang/Downloads/temp/test.log";
		try (Writer writer = new FileWriter(file, StandardCharsets.UTF_8)) {
			String content = "Hello World!";
			writer.write(content); // 写入String
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
