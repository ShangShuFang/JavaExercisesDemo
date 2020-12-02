package com.shangshufang.homework.step2.knowledge9002_01.demo3;

public class Car {
    private String name = "小汽车";

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public void travel() {
        System.out.println(this.name + "正在行驶");
    }

    public void travel(int speed) {
        System.out.println(this.name + "正在以" + speed + "公里的速度行驶");
    }
}