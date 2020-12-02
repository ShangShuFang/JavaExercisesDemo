package com.shangshufang.homework.step2.knowledge9002_05.demo2;

public class Computer {
    private String type;
    private String brand;

    public Computer(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return this.type;
    }

    public String getBrand() {
        return this.brand;
    }

    public void start() {
        System.out.println("电脑开机启动...");
    }

    public void turnOff() {
        System.out.println("电脑正在关机");
    }
}
