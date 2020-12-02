package com.shangshufang.homework.step2.knowledge9002_04.demo1;

/**
 * 员工基类
 */
public class Employee {
    private final double basicSalary;
    public String fullName;
    public Employee(String fullName, double basicSalary) {
        this.fullName = fullName;
        this.basicSalary = basicSalary;
    }

    public double getAnnualBasicSalary() {
        return this.basicSalary * 12;
    }
}