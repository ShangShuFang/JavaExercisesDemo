package com.shangshufang.homework.step2.knowledge9002_07.demo2;

/**
 * Java面向对象-多态-抽象类
 */
public class Demo2 {
    public static void main(String[] args) {
        String applianceItemName = "格里空调";
        double applianceItemUnitPrice = 3860;
        int applianceItemCount = 3;
        double applianceOrderAmount;
        String applianceOrderMemo;

        var applianceOrder = new ApplianceOrder(applianceItemName, applianceItemUnitPrice, applianceItemCount);
        applianceOrderAmount = applianceOrder.getOrderAmount();
        applianceOrderMemo = applianceOrder.getOrderMemo();

        System.out.println("您购买了" + applianceOrder.getItemCount() + "台" + applianceItemName + "，原价:" + applianceOrder.getItemTotalPrice() + "元" + "，优惠后:" + applianceOrderAmount + "元");
        System.out.println("配送备注: " + applianceOrderMemo);

        //---------------------------------------------------
        String clothingItemName = "南极人羽绒服";
        double clothingItemUnitPrice = 880;
        int clothingCount = 1;
        double clothingItemCouponAmount = 60;
        double clothingOrderAmount;
        String clothingOrderMemo;

        var clothingOrder = new ClothingOrder(clothingItemName, clothingItemUnitPrice, clothingCount, clothingItemCouponAmount);
        clothingOrderAmount = clothingOrder.getOrderAmount();
        clothingOrderMemo = clothingOrder.getOrderMemo();

        System.out.println("您购买了" + clothingOrder.getItemCount() + "件" + clothingItemName + "，原价:" + clothingOrder.getItemTotalPrice() + "元" + "，优惠后:" + clothingOrderAmount + "元");
        System.out.println("配送备注: " + clothingOrderMemo);

    }
}
