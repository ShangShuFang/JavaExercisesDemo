package com.shangshufang.homework.step2.knowledge9002_07.demo1;

public class BenzCar extends AbstractCar {

    public BenzCar(String model, String color) {
        super("奔驰", model, color);
    }

    @Override
    public void changeGear() {
        System.out.println("我的" + super.getColor() + super.getBrand() + super.getModel() + "正在进行手动换挡");
    }
}
