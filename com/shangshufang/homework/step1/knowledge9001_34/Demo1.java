package com.shangshufang.homework.step1.knowledge9001_34;

import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class Demo1 {
	public static void main(String[] args) {
		final String file = "/Users/zhangqiang/Downloads/temp/test.log";
		try (Reader reader = new FileReader(file, StandardCharsets.UTF_8)) {
			while (true) {
				int n = reader.read(); // 反复调用read()方法，直到返回-1
				if (n == -1) {
					break;
				}
				System.out.println((char)n); // 打印char
			}
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
