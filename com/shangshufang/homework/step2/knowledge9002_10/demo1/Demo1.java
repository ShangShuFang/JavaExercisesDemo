package com.shangshufang.homework.step2.knowledge9002_10.demo1;

import com.shangshufang.homework.step2.knowledge9002_10.demo1.enums.BenzModelEnum;
import com.shangshufang.homework.step2.knowledge9002_10.demo1.enums.BmwModelEnum;
import com.shangshufang.homework.step2.knowledge9002_10.demo1.enums.CarBrandEnum;
import com.shangshufang.homework.step2.knowledge9002_10.demo1.enums.ColorEnum;
import com.shangshufang.homework.step2.knowledge9002_10.demo1.service.impl.BenzServiceImpl;
import com.shangshufang.homework.step2.knowledge9002_10.demo1.service.impl.BmwServiceImpl;
import com.shangshufang.homework.step2.knowledge9002_10.demo1.vo.BenzVO;
import com.shangshufang.homework.step2.knowledge9002_10.demo1.vo.BmwVO;

/**
 * Java面向对象-包及访问修饰符
 */
public class Demo1 {
    public static void main(String[] args) {
        var bmwCar = new BmwServiceImpl();
        var benzCar = new BenzServiceImpl();

        var bmwVO = new BmwVO();
        bmwVO.setBrand(CarBrandEnum.BMW);
        bmwVO.setModelEnum(BmwModelEnum.FIVE_530Li);
        bmwVO.setColor(ColorEnum.BLUE);

        bmwCar.start(bmwVO);
        bmwCar.travel(bmwVO, 100);
        bmwCar.autoTravel(bmwVO, 80);
        bmwCar.stop(bmwVO);

        var benzVO = new BenzVO();
        benzVO.setBrand(CarBrandEnum.BENZ);
        benzVO.setModelEnum(BenzModelEnum.GLE450);
        benzVO.setColor(ColorEnum.BLACK);

        benzCar.start(benzVO);
        benzCar.travel(benzVO, 120);
        benzCar.autoTravel(benzVO, 100);
        benzCar.autoDrive(benzVO, 90);
        benzCar.stop(benzVO);
    }
}
