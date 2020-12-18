package com.shangshufang.homework.step1.knowledge9001_33;

import java.io.*;

public class Demo2 {
	public static void main(String[] args) {
		byte[] data;
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            output.write("Hello ".getBytes("UTF-8"));
            output.write("world!".getBytes("UTF-8"));
			data = output.toByteArray();
			System.out.println(new String(data, "UTF-8"));
        } catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
