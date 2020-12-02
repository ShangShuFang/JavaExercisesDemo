package com.shangshufang.homework.step2.knowledge9002_04.demo1;

/**
 * Java面向对象-继承-supper与this
 */
public class Demo1 {
    public static void main(String[] args) {
        GeneralStaff staff = new GeneralStaff("郭碧婷", 15800.00, 30000.00);
        Manager manager = new Manager("雷佳音", 26980.00, 8000, 50000.00);
        Executive executive = new Executive("张钧甯", 48500.00, 12000.00, 65000.00, 2300);

        System.out.println("员工【" + staff.fullName + "】当前的年收入为：" + staff.getAnnualSalary());
        System.out.println("主管【" + manager.fullName + "】当前的年收入为：" + manager.getAnnualSalary());
        System.out.println("高管【" + executive.fullName + "】当前的年收入为：" + executive.getAnnualSalary());
    }
}