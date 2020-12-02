package com.shangshufang.homework.step2.knowledge9002_06.demo1;

/**
 * Java面向对象-多态-重载
 */
public class Demo1 {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("X6", "红色");
        Benz benz = new Benz("GLE", "黑色");

        bmw.start();
        bmw.travel();
        bmw.travel(100);
        bmw.stop();

        benz.start();
        benz.travel();
        benz.travel(120);
        benz.stop();
    }
}
