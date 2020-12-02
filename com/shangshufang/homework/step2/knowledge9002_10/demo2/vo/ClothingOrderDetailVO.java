package com.shangshufang.homework.step2.knowledge9002_10.demo2.vo;

import com.shangshufang.homework.step2.knowledge9002_10.demo2.enums.ClothingColorEnum;
import com.shangshufang.homework.step2.knowledge9002_10.demo2.enums.ClothingSizeEnum;

public class ClothingOrderDetailVO extends OrderDetailVO {
    private ClothingColorEnum clothingColor;
    private ClothingSizeEnum clothingSize;

    public ClothingColorEnum getClothingColor() {
        return clothingColor;
    }

    public void setClothingColor(ClothingColorEnum clothingColor) {
        this.clothingColor = clothingColor;
    }

    public ClothingSizeEnum getClothingSize() {
        return clothingSize;
    }

    public void setClothingSize(ClothingSizeEnum clothingSize) {
        this.clothingSize = clothingSize;
    }
}
