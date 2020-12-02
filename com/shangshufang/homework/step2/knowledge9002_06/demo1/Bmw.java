package com.shangshufang.homework.step2.knowledge9002_06.demo1;

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
        System.out.println("您的" + super.getColor() + super.getBrand() + super.getModel() + "正在形式");
    }

    public void travel(int speed) {
        System.out.println("您的" + super.getColor() + super.getBrand() + super.getModel() + "正在以每小时" + speed + "公里的时速行驶");
    }

    public void stop() {
        System.out.println("您的" + super.getColor() + super.getBrand() + super.getModel() + "已停止");
    }
}
