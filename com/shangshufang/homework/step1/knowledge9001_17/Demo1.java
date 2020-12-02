package com.shangshufang.homework.step1.knowledge9001_17;

/**
 * Java数组-创建、初始化及取值
 */
public class Demo1 {
    public static void main(String[] args) {
        String[] actorArray = new String[10];
        actorArray[0] = "江疏影";
        actorArray[1] = "张馨予";
        actorArray[2] = "李小璐";
        actorArray[3] = "张若昀";
        actorArray[4] = "陈赫";
        actorArray[5] = "张钧甯";
        actorArray[6] = "王鸥";
        actorArray[7] = "张歆艺";
        actorArray[8] = "陈晓";
        actorArray[9] = "韩雪";

        System.out.println("80后著名演员：");
        for (int i = 0; i < 10; i++) {
            System.out.println(actorArray[i]);
        }
    }
}