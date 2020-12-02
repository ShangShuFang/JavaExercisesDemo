package com.shangshufang.homework.step2.knowledge9002_07.demo1;

/**
 * 基类-抽象类
 */
public abstract class AbstractCar {
    private String brand;
    private String model;
    private String color;

    public AbstractCar(String brand, String model, String color) {
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
        System.out.println(this.getColor() + this.getBrand() + this.getModel() + "已启动");
    }

    public void travel(int speed) {
        System.out.println(this.getColor() + this.getBrand() + this.getModel() + "正在以每小时" + speed + "公里的时速行驶");
    }

    public void stop() {
        System.out.println(this.getColor() + this.getBrand() + this.getModel() + "已停止");
    }

    public abstract void changeGear();
}