package com.shangshufang.homework.step1.knowledge9001_35;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Demo1 {
	public static void main(String[] args) {
		final String file = "/Users/zhangqiang/Downloads/temp/test.log";
		try (Writer writer = new FileWriter(file, StandardCharsets.UTF_8)) {
			writer.write('上'); // 写入单个字符
			writer.write('书'); // 写入单个字符
			writer.write('房'); // 写入单个字符
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
