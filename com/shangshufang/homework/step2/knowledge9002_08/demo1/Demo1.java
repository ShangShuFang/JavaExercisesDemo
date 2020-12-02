package com.shangshufang.homework.step2.knowledge9002_08.demo1;

/**
 * Java面向对象-多态-接口
 */
public class Demo1 {
    public static void main(String[] args) {
        BmwService bmwCar = new BmwServiceImpl();
        CarModel bmwModel = new CarModel();
        bmwModel.setBrand("宝马");
        bmwModel.setModel("X5");
        bmwModel.setColor("红色");

        bmwCar.start(bmwModel);
        bmwCar.travel(bmwModel, 100);
        bmwCar.autoTravel(bmwModel, 80);
        bmwCar.stop(bmwModel);

        //---------------------------------------------------

        BenzService benzCar = new BenzServiceImpl();
        CarModel benzModel = new CarModel();
        benzModel.setBrand("奔驰");
        benzModel.setModel("S600");
        benzModel.setColor("黑色");

        benzCar.start(benzModel);
        benzCar.travel(benzModel, 120);
        benzCar.autoTravel(benzModel, 100);
        benzCar.autoDrive(benzModel, 90);
        benzCar.stop(benzModel);
    }
}
