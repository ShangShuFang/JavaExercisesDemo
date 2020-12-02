package com.shangshufang.homework.step2.knowledge9002_06.demo2;

public class NotebookComputer extends Computer {

    public NotebookComputer(String brand) {
        super("笔记本", brand);
    }
    
    public void start() {
        int seconds = 10;
        System.out.println("您的" + super.getBrand() + super.getType() + "电脑已开机，开机时间为" + seconds + "秒");
    }

    public void openSoftware(String openMode, String appName) {
        switch (openMode) {
            case "S":
                System.out.println("通过搜索打开：" + appName);
                break;
            case "C":
                System.out.println("通过单击打开：" + appName);
                break;
            case "V":
                System.out.println("通过语音打开：" + appName);
                break;
            default:
                break;
        }
    }

    public void turnOff() {
        System.out.println("您的" + super.getBrand() + super.getType() + "电脑正在关机...");
    }
}
