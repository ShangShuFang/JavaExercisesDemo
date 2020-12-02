package com.shangshufang.homework.step2.knowledge9002_03.demo2;

/**
 * Java面向对象-继承
 */
public class Demo2 {
    public static void main(String[] args) {
        CustomerMapper customerData = new CustomerMapper();
        customerData.insert();
        customerData.update();
        customerData.delete();
        customerData.select(1001);
        customerData.select("胡歌");
    }
}