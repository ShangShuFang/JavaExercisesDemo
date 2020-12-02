package com.shangshufang.homework.step2.knowledge9002_10.demo1.service.impl;

import com.shangshufang.homework.step2.knowledge9002_10.demo1.service.BmwService;
import com.shangshufang.homework.step2.knowledge9002_10.demo1.vo.BmwVO;

public class BmwServiceImpl implements BmwService {

    @Override
    public void start(Object car) {
        BmwVO bmwVO = (BmwVO)car;
        System.out.println("Your " + bmwVO.getColor() + " " + bmwVO.getBrand() + " " + bmwVO.getModelEnum() + " starts.");
    }

    @Override
    public void travel(Object car, int speed) {
        BmwVO bmwVO = (BmwVO)car;
        System.out.println("Your " + bmwVO.getColor() + " " + bmwVO.getBrand() + " " + bmwVO.getModelEnum() + " is driving at " + speed + " kph.");
    }

    @Override
    public void stop(Object car) {
        BmwVO bmwVO = (BmwVO)car;
        System.out.println("Your " + bmwVO.getColor() + " " + bmwVO.getBrand() + " " + bmwVO.getModelEnum() + " stop.");
    }

    @Override
    public void autoTravel(BmwVO bmwVO, int speed) {
        System.out.println("Your " + bmwVO.getColor() + " " + bmwVO.getBrand() + " " + bmwVO.getModelEnum() + " launches adaptive cruise.");
    }
}
