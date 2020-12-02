package com.shangshufang.homework.step1.knowledge9001_12;
/**
 * Java条件语句-if...else
 */
public class Demo1 {
    public static void main(String[] args) {
        final int maxWeight = 400;
        int headCount = 6;
        int averageWeight = 70;
        int totalWeight = headCount * averageWeight;

        if (totalWeight > maxWeight) {
            System.out.println("电梯已超重，发出提示音！");
            return;
        }
        System.out.println("电梯未超重");
    }
}