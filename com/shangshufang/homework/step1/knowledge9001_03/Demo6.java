package com.shangshufang.homework.step1.knowledge9001_03;

/**
 * Java运算符-算术运算符
 */
public class Demo6 {
    public static void main(String[] args) {
        int a = 15;
        int b = 6;

        int c = a++;
        System.out.println("15++ = " + c);

        int d = ++a;
        System.out.println("++15 = " + d);

        int e = b--;
        System.out.println("6-- = " + e);

        int f = --b;
        System.out.println("--6 = " + f);
    }
}