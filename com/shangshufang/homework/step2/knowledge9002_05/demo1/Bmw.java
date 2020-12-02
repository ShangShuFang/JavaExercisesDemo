package com.shangshufang.homework.step2.knowledge9002_05.demo1;

/**
 * 子类
 */
public class Bmw extends Car {
    private static final String brand = "宝马";

    public Bmw(String model, String color) {
        super(brand, model, color);
    }

    public void start() {
        System.out.println("您的" + super.getColor() + super.getBrand() + super.getModel() + "已启动");
    }

    public void travel() {
        System.out.println("您的" + super.getColor() + super.getBrand() + super.getModel() + "正在行驶");
    }

    public void stop() {
        System.out.println("您的" + super.getColor() + super.getBrand() + super.getModel() + "已停止");
    }
}
