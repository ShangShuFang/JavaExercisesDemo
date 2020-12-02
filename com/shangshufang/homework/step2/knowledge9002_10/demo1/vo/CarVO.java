package com.shangshufang.homework.step2.knowledge9002_10.demo1.vo;

import com.shangshufang.homework.step2.knowledge9002_10.demo1.enums.CarBrandEnum;
import com.shangshufang.homework.step2.knowledge9002_10.demo1.enums.ColorEnum;

public class CarVO {
    private CarBrandEnum brand;
    private ColorEnum color;

    public CarBrandEnum getBrand() {
        return brand;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public void setBrand(CarBrandEnum brand) {
        this.brand = brand;
    }
}
