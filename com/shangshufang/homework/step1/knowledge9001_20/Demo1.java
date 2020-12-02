package com.shangshufang.homework.step1.knowledge9001_20;

/**
 * Java方法-void关键字及按值传参
 */
public class Demo1 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("传入方法之前的值为：" + number);
        addNumber(number);
        System.out.println("经过方法内计算后的值为：" + number);        
    }

    /**
     * 改变参数的内容(数字)
     * @param number 数字
     */
    static void addNumber(int number) {
        number += 20;
        System.out.println("在方法内加20之后的值为：" + number);
    }
}