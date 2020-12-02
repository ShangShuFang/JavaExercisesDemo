package com.shangshufang.homework.step1.knowledge9001_10;
/**
 * Java运算符-赋值运算符
 */
public class Demo1 {
    public static void main(String[] args) {
        //简单的赋值运算符，将右操作数的值赋给左侧操作数
        double penUnitPrice = 25.5; //钢笔单价
        int penCount = 5; //购买钢笔数量

        double riceUnitPrice = 29.80; //大米单价
        int riceCount = 1; //购买大米数量

        double drinksUnitPrice = 2.6; //饮料单价
        int drinksCount = 2; //购买饮料数量

        double totalPrice = (penUnitPrice * penCount) + (riceUnitPrice * riceCount) + (drinksUnitPrice * drinksCount); //简单的赋值运算符
        System.out.println("购物总价：" + totalPrice);

        //加等赋值操作符，它把左操作数和右操作数相加赋值给左操作数
        double beerUnitPrice = 6.5;
        int beerCount = 6;
        double beerTotalPrice = beerUnitPrice * beerCount;
        totalPrice += beerTotalPrice;
        System.out.println("再次购买啤酒后的购物总价：" + totalPrice);

        //乘等赋值操作符，它把左操作数和右操作数相乘赋值给左操作数
        float discount = 0.85F;
        totalPrice *= discount;
        System.out.println("85折后的购物总价：" + totalPrice);
    }
}