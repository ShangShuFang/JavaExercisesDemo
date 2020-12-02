package com.shangshufang.homework.step2.knowledge9002_01.demo2;

public class Vehicle {
    private String name;
    
    public Vehicle(String name) {
        this.name = name;
    }

    public void travel() {
        System.out.println(this.name + "正在行驶");
    }

    public void travel(int speed) {
        System.out.println(this.name + "以" + speed + "公里的速度正在行驶");
    }    
}