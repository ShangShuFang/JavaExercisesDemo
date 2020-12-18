package com.shangshufang.homework.step1.knowledge9001_35;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Demo2 {
	public static void main(String[] args) {
		final String file = "/Users/zhangqiang/Downloads/temp/test.log";
		try (Writer writer = new FileWriter(file, StandardCharsets.UTF_8)) {
			char[] charArray = new char[5];
			charArray[0] = 'a';
			charArray[1] = 'b';
			charArray[2] = 'c';
			charArray[3] = 'd';
			charArray[4] = 'e';
			writer.write(charArray); // 写入char[]
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
