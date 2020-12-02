package com.shangshufang.homework.step2.knowledge9002_05.demo1;

/**
 * 基类
 */
public class Car {
    private String brand;
    private String model;
    private String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public void start() {
        System.out.println(this.color + "的"  + this.brand + this.model + "已启动");
    }

    public void travel() {
        System.out.println(this.color + "的" + this.brand + this.model + "正在行驶");
    }

    public void stop() {
        System.out.println(this.color + "的" + this.brand + this.model + "已停止");
    }
}