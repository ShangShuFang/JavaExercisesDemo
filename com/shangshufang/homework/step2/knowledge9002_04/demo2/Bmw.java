package com.shangshufang.homework.step2.knowledge9002_04.demo2;

public class Bmw extends Car {
    public Bmw(String model, String color) {
        super("宝马", model, color);
    }

    public void turnOnAutomaticFollowing() {
        System.out.println(this.getFullName() + "启动自动跟车");
    }
}