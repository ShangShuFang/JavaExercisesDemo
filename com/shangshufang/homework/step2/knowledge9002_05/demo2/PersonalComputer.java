package com.shangshufang.homework.step2.knowledge9002_05.demo2;

public class PersonalComputer extends Computer {

    public PersonalComputer(String brand) {
        super("台式机", brand);
    }
    
    public void start() {
        int seconds = 15;
        System.out.println("您的" + super.getBrand() + super.getType() + "电脑已开机，开机时间为" + seconds + "秒");
    }

    public void turnOff() {
        System.out.println("您的" + super.getBrand() + super.getType() + "电脑正在关机...");
    }
}
