package com.shangshufang.homework.step1.knowledge9001_03;

/**
 * Java运算符-算术运算符
 */
public class Demo3 {
    public static void main(String[] args) {
        //商品总数
        int itemCount = 3;
        //商品单价
        double itemPrice = 85.5;
        //优惠券
        float discount = 20;
        //运费
        double freightCharge = 10;
        //订单总金额
        double orderAmount = itemCount * itemPrice -  discount + freightCharge;

        System.out.println("订单总金额：" + orderAmount);
    }
}