package com.shangshufang.homework.step2.knowledge9002_03.demo1;

public class Animal {
    private String name = "小动物";
    
    public void eat() {
        System.out.println(this.name + "正在吃东西");
    }
    
    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }

    public void run() {
        System.out.println(this.name + "正在奔跑");
    }

    public void run(String direction) {
        System.out.println(this.name + "正在向" + direction + "奔跑");
    }
}