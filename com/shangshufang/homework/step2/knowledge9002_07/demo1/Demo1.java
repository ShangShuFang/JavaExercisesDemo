package com.shangshufang.homework.step2.knowledge9002_07.demo1;

/**
 * Java面向对象-多态-抽象类
 */
public class Demo1 {
    public static void main(String[] args) {
        BmwCar bmwCar = new BmwCar("X5", "红色");
        BenzCar benzCar = new BenzCar("GLE", "黑色");

        bmwCar.start();
        bmwCar.changeGear();
        bmwCar.travel(120);
        bmwCar.stop();

        benzCar.start();
        benzCar.changeGear();
        benzCar.travel(140);
        benzCar.stop();
    }
}
