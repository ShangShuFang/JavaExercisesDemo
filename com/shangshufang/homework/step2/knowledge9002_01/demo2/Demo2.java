package com.shangshufang.homework.step2.knowledge9002_01.demo2;

/**
 * Java面向对象-类与对象-构造函数及实例化方法
 */
public class Demo2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("自行车");
        vehicle.travel();
        vehicle.travel(20);
    }
}