package com.shangshufang.homework.step1.knowledge9001_20;

/**
 * Java方法-void关键字及按值传参
 */
public class Demo3 {
    public static void main(String[] args) {
        double orderAmount = 580.50;
        System.out.println("传入方法修改前的内容为：" + orderAmount);
        fixAmount(orderAmount);
        System.out.println("经过方法修改后的内容为：" + orderAmount);
        
    }

    /**
     * 改变参数的内容（double）
     * @param amount 金额
     */
    static void fixAmount(double amount) {
        amount += 120;
        System.out.println("在方法内修改后的内容为：" + amount);
    }
}