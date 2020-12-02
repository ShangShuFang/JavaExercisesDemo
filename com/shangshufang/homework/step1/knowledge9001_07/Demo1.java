package com.shangshufang.homework.step1.knowledge9001_07;

/**
 * Java数据类型转换-自动类型转换
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        低  ------------------------------------>  高
        byte,short,char—> int —> long—> float —> double 
         */
        byte b = 127;
        short s = 32767;
        char c = 'a';

        int i = b;
        System.out.println("将byte类型的变量（值为127）自动转换为int后的值为：" + i);

        i = s;
        System.out.println("将short类型的变量（值为32767）自动转换为int后的值为：" + i);
        
        i = c;
        System.out.println("将char类型的变量（值为a）自动转换为int后的值为：" + i);
    }
}