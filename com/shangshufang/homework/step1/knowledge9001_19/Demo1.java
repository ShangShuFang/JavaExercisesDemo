package com.shangshufang.homework.step1.knowledge9001_19;

/**
 * Java方法-方法的定义与调用
 */
public class Demo1 {
    public static void main(String[] args) {
        final int SEX_MALE = 1;
        final int SEX_FEMALE = 2;
        String hello1 = buildHello("江疏影", SEX_FEMALE);
        String hello2 = buildHello("李小璐", SEX_FEMALE);
        String hello3 = buildHello("张若昀", SEX_MALE);

        System.out.println(hello1);
        System.out.println(hello2);
        System.out.println(hello3);
    }

    /**
     * 组装完成的欢迎词
     * @param customerName 客户姓名
     * @param sex 客户性别
     * @return 反馈组装完成的欢迎词
     */
    static String buildHello(String customerName, int sex) {
        String hello = "";
        if (sex == 1) {
            hello = customerName + "先生，欢迎光临！";
        } else {
            hello = customerName + "女士，欢迎光临！";
        }
        return hello;
    }
}