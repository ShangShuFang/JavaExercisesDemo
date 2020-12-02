package com.shangshufang.homework.step2.knowledge9002_05.demo1;

/**
 * Java面向对象-多态-重写
 */
public class Demo1 {
    public static void main(String[] args) {
        Car bmw = new Bmw("X6", "红色");
        Car benz = new Benz("GLE", "黑色");

        bmw.start();
        bmw.travel();
        bmw.stop();

        benz.start();
        benz.travel();
        benz.stop();
    }
}
