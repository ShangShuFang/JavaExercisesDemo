package com.shangshufang.homework.step1.knowledge9001_23;

/**
 * Java方法-方法的重载
 */
public class Demo3 {
    public static void main(String[] args) {
        float result1 = sum(59.99F, 68.99F);
        System.out.println(result1);

        float result2 = sum(59.99F, 68.99F, 65.50F);
        System.out.println(result2);
    }

    static float sum(float amount1, float amount2) {
        return amount1 + amount2;
    }

    static float sum(float amount1, float amount2, float amount3) {
        return amount1 + amount2 + amount3;
    }
}