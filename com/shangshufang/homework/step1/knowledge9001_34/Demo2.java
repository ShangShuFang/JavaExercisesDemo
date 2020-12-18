package com.shangshufang.homework.step1.knowledge9001_34;

import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class Demo2 {
	public static void main(String[] args) {
		final String file = "/Users/zhangqiang/Downloads/temp/test.log";
		try (Reader reader = new FileReader(file, StandardCharsets.UTF_8)) {
			char[] buffer = new char[1000];
			int n;
			while ((n = reader.read(buffer)) != -1) {
				System.out.println("read " + n + " chars.");
			}
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
