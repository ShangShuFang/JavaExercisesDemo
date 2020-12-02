package com.shangshufang.homework.step2.knowledge9002_04.demo2;

public class Demo2 {
    public static void main(String[] args) {
        Benz benz1 = new Benz("S300L", "黑色");
        Bmw bmw1 = new Bmw("530Li", "藏青色");

        benz1.print();
        benz1.start();
        benz1.turnOnAirPurification();
        benz1.travel();
        benz1.stop();

        bmw1.print();
        bmw1.start();
        bmw1.turnOnAutomaticFollowing();;
        bmw1.travel();
        bmw1.stop();
    }
}