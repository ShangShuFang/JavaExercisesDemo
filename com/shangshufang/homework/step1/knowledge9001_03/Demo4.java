package com.shangshufang.homework.step1.knowledge9001_03;

/**
 * Java运算符-算术运算符
 */
public class Demo4 {
    public static void main(String[] args) {
        //订单总金额
        double orderAmount = 14997;
        //购买总数
        int itemCount = 3;

        //商品单价
        double itemPrice = orderAmount / itemCount;

        System.out.println("手机单价:" + itemPrice);
    }
}