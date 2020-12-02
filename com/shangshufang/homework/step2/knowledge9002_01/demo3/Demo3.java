package com.shangshufang.homework.step2.knowledge9002_01.demo3;

/**
 * Java面向对象-类与对象-构造函数及实例化方法
 */
public class Demo3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.travel();
        car.travel(80);

        Car bmw = new Car("宝马");
        bmw.travel();
        bmw.travel(120);
    }
}