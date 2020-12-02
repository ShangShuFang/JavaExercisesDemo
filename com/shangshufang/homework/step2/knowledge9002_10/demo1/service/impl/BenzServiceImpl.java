package com.shangshufang.homework.step2.knowledge9002_10.demo1.service.impl;

import com.shangshufang.homework.step2.knowledge9002_10.demo1.service.BenzService;
import com.shangshufang.homework.step2.knowledge9002_10.demo1.vo.BenzVO;

public class BenzServiceImpl implements BenzService {
    @Override
    public void start(Object car) {
        BenzVO benzVO = (BenzVO)car;
        System.out.println("My " + benzVO.getColor() + " " + benzVO.getBrand() + " " + benzVO.getModelEnum() + " starts.");
    }

    @Override
    public void travel(Object car, int speed) {
        BenzVO benzVO = (BenzVO)car;
        System.out.println("My " + benzVO.getColor() + " " + benzVO.getBrand() + " " + benzVO.getModelEnum() + " is driving at " + speed + " kph.");
    }

    @Override
    public void stop(Object car) {
        BenzVO benzVO = (BenzVO)car;
        System.out.println("My " + benzVO.getColor() + " " + benzVO.getBrand() + " " + benzVO.getModelEnum() + " stop.");
    }

    @Override
    public void autoTravel(BenzVO benzVO, int speed) {
        System.out.println("My " + benzVO.getColor() + " " + benzVO.getBrand() + " " + benzVO.getModelEnum() + " launches adaptive cruise.");
    }

    @Override
    public void autoDrive(BenzVO benzVO, int speed) {
        System.out.println("My " + benzVO.getColor() + " " + benzVO.getBrand() + " " + benzVO.getModelEnum() + " starts autopilot.");
    }
}
