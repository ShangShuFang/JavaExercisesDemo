package com.shangshufang.homework.step2.knowledge9002_08.demo1;

public class BmwServiceImpl implements BmwService {

    @Override
    public void start(CarModel car) {
        System.out.println("您的" + car.getColor() + car.getBrand() + car.getModel() + "已启动");
    }

    @Override
    public void travel(CarModel car, int speed) {
        System.out.println("您的" + car.getColor() + car.getBrand() + car.getModel() + "正在以每小时" + speed + "公里的时速行驶");
    }

    @Override
    public void stop(CarModel car) {
        System.out.println("您的" + car.getColor() + car.getBrand() + car.getModel() + "已停止");
    }

    @Override
    public void autoTravel(CarModel car, int speed) {
        System.out.println("您的" + car.getColor() + car.getBrand() + car.getModel() + "启动自适应巡航");
    }
    
}
