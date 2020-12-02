package com.shangshufang.homework.step2.knowledge9002_09.demo2;

public class OrderDetailVO {
    private String itemName;
    private double itemUnitPrice;
    private int itemCount;
    private double discount = 1;

    public String getItemName() {
        return itemName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
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
