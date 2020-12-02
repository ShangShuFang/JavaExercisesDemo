package com.shangshufang.homework.step1.knowledge9001_13;
/**
 * Java条件语句-switch case
 */
public class Demo2 {
    public static void main(String[] args) {
        int classNO = 4;
        switch (classNO) {
            case 1:
                System.out.println("这是1班的同学");
                break;
            case 2:
                System.out.println("这是2班的同学");
                break;
            case 3:
                System.out.println("这是3班的同学");
                break;
            case 4:
                System.out.println("这是4班的同学");
                break;
            default:
                System.out.println("这个...不知道啊");
        }
    }
}