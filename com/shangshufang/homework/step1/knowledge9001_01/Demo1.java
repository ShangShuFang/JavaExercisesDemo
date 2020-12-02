package com.shangshufang.homework.step1.knowledge9001_01;

/**
 * Java命令行程序-输出
 */
public class Demo1 {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println("arg = " + arg);
            }
        }
//        System.out.println("不放弃逛街、睡觉、打游戏，怎么遇见未来更好的自己！");
        System.out.println("args.l="+args.length);
    }
}