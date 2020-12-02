package com.shangshufang.homework.step2.knowledge9002_10.demo2.service;

import com.shangshufang.homework.step2.knowledge9002_10.demo2.vo.OrderVO;

public interface OrderService {
    double getOrderAmount(OrderVO orderModel);

    void printOrderInfo(OrderVO orderModel);
}
