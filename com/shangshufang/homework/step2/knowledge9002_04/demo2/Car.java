package com.shangshufang.homework.step2.knowledge9002_04.demo2;

public class Car {
    private String brand;
    private String model;
    private String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getFullName() {
        return this.color + "的" + this.brand + this.model;
    }

    public void print() {
        System.out.println("这是一辆" + this.color + "的" + this.brand + this.model);
    }

    public void start() {
        System.out.println(this.color + "的" + this.brand + this.model + "已启动");
    }

    public void travel() {
        System.out.println(this.color + "的" + this.brand + this.model + "正在行驶");
    }

    public void stop() {
        System.out.println(this.color + "的" + this.brand + this.model + "已停止");
    }
}