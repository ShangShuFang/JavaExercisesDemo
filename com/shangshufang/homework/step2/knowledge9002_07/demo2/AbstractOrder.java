package com.shangshufang.homework.step2.knowledge9002_07.demo2;

public abstract class AbstractOrder {
    private String itemName;
    private double itemUnitPrice;
    private int itemCount;
    public AbstractOrder (String itemName, double itemUnitPrice, int itemCount) {
        this.itemName = itemName;
        this.itemUnitPrice = itemUnitPrice;
        this.itemCount = itemCount;
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getItemCount() {
        return this.itemCount;
    }

    public double getItemTotalPrice() {
        return this.itemUnitPrice * this.itemCount;
    }

    public abstract double getOrderAmount();

    public abstract String getOrderMemo();
}
