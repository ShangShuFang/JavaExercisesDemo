package com.shangshufang.homework.step1.knowledge9001_09;

/**
 * Java运算符-关系运算符
 */
public class Demo3 {
    public static void main(String[] args) {
        double audiUnitPrice = 528900.00;
        float audiDiscount = 0.95F;
        double audiPrice = audiUnitPrice * audiDiscount;

        double bmwUnitPrice = 653000.00;
        float bmwDiscount = 0.9F;
        double bmwPrice = bmwUnitPrice * bmwDiscount;

        System.out.println("奥迪价格 == 宝马价格: " + (audiPrice == bmwPrice));
        System.out.println("奥迪价格 != 宝马价格: " + (audiPrice != bmwPrice));
        System.out.println("奥迪价格 > 宝马价格: " + (audiPrice > bmwPrice));
        System.out.println("奥迪价格 >= 宝马价格: " + (audiPrice >= bmwPrice));
        System.out.println("奥迪价格 < 宝马价格: " + (audiPrice < bmwPrice));
        System.out.println("奥迪价格 <= 宝马价格: " + (audiPrice <= bmwPrice));
    }
}