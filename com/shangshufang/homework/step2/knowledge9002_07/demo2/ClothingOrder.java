package com.shangshufang.homework.step2.knowledge9002_07.demo2;

public class ClothingOrder extends AbstractOrder {
    private double couponAmount;
    public ClothingOrder(String itemName, double itemUnitPrice, int itemCount, double couponAmount) {
        super(itemName, itemUnitPrice, itemCount);
        this.couponAmount = couponAmount;
    }

    @Override
    public double getOrderAmount() {
        if (super.getItemTotalPrice() >= 600) {
            return super.getItemTotalPrice() - this.couponAmount;
        }
        return super.getItemTotalPrice();
    }

    @Override
    public String getOrderMemo() {
        return "无";
    }
}
