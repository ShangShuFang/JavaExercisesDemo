package com.shangshufang.homework.step2.knowledge9002_07.demo1;

public class BmwCar extends AbstractCar {
    public BmwCar(String model, String color) {
        super("宝马", model, color);
    }

    @Override
    public void changeGear() {
        System.out.println("我的" + super.getColor() + super.getBrand() + super.getModel() + "正在进行自动换挡");
    }
}
