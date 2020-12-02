package com.shangshufang.homework.step2.knowledge9002_04.demo2;

public class Benz extends Car {
    public Benz(String model, String color) {
        super("奔驰", model, color);
    }

    public void turnOnAirPurification() {
        System.out.println(this.getFullName() + "空气净化系统打开");
    }
}