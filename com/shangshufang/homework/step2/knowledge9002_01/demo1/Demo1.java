package com.shangshufang.homework.step2.knowledge9002_01.demo1;

/**
 * Java面向对象-类与对象-构造函数及实例化方法
 */
public class Demo1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.eat("饼干");
        animal.run();
        animal.run("西");

        Animal dog = new Animal("小狗");
        dog.eat();
        dog.eat("骨头");
        dog.run();
        dog.run("东");
    }
}