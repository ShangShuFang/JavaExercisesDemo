package com.shangshufang.homework.step2.knowledge9002_10.demo1.service;

import com.shangshufang.homework.step2.knowledge9002_10.demo1.vo.BmwVO;

public interface BmwService extends CarService {
    void autoTravel(BmwVO car, int speed);
}
