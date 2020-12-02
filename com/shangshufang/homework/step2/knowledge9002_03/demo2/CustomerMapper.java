package com.shangshufang.homework.step2.knowledge9002_03.demo2;

public class CustomerMapper extends BaseMapper {
    public void select(int customerID) {
        System.out.println("根据客户编号【" + customerID + "】查询客户信息");
    }

    public void select(String customerName) {
        System.out.println("根据客户姓名【" + customerName + "】查询客户信息");
    }
}