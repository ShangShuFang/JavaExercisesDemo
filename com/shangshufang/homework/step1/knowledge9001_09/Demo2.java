package com.shangshufang.homework.step1.knowledge9001_09;

/**
 * Java运算符-关系运算符
 */
public class Demo2 {
    public static void main(String[] args) {
        int mobileCount = 5;
        double mobilePrice = 2860;
        double mobileOrderAmount = mobilePrice * mobileCount;

        int computerCount = 2;
        double computerPrice = 7150;
        double computerOrderAmount = computerPrice * computerCount;

        System.out.println("手机订单总金额 == 电脑订单总金额: " + (mobileOrderAmount == computerOrderAmount));
        System.out.println("手机订单总金额 != 电脑订单总金额: " + (mobileOrderAmount != computerOrderAmount));
        System.out.println("手机订单总金额 > 电脑订单总金额: " + (mobileOrderAmount > computerOrderAmount));
        System.out.println("手机订单总金额 >= 电脑订单总金额: " + (mobileOrderAmount >= computerOrderAmount));
        System.out.println("手机订单总金额 < 电脑订单总金额: " + (mobileOrderAmount < computerOrderAmount));
        System.out.println("手机订单总金额 <= 电脑订单总金额: " + (mobileOrderAmount <= computerOrderAmount));
    }
}