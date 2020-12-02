package com.shangshufang.homework.step2.knowledge9002_07.demo2;

public class ApplianceOrder extends AbstractOrder {
    public ApplianceOrder(String itemName, double itemUnitPrice, int itemCount) {
        super(itemName, itemUnitPrice, itemCount);
    }

    @Override
    public double getOrderAmount() {
        double discount = 1;
        int itemCount = super.getItemCount();
        switch(itemCount) {
            case 1:
                discount = 0.98;
            break;
            case 2:
                discount = 0.95;
            break;
            case 3:
                discount = 0.90;
            break;
            case 4:
                discount = 0.82;
            break;
            case 5:
                discount = 0.75;
            break;
            default:
                discount = 0.70;
            break;
        }
        return super.getItemTotalPrice() * discount;
    }

    @Override
    public String getOrderMemo() {
        return "电器商品，请轻拿轻放。助力扶贫，我们在行动！";
    }
}
