package com.shangshufang.homework.step2.knowledge9002_08.demo1;

public interface BenzService extends CarService {
    /**
     * 自适应巡航
     * @param car 车辆模型
     * @param speed 自适应巡航速度
     */
    void autoTravel(CarModel car, int speed);

    /**
     * 自动驾驶
     * @param car 车辆模型
     * @param speed 自动驾驶速度
     */
    void autoDrive(CarModel car, int speed);
}
