package com.shangshufang.homework.step2.knowledge9002_10.demo2.vo;

public class OrderDetailVO {
    private String itemName;
    private double itemUnitPrice;
    private int itemCount;
    private float discount = 1;

    public String getItemName() {
        return itemName;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getItemUnitPrice() {
        return itemUnitPrice;
    }

    public void setItemUnitPrice(double itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
