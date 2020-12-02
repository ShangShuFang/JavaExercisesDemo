package com.shangshufang.homework.step2.knowledge9002_04.demo1;

/**
 * 普通员工
 */
public class GeneralStaff extends Employee {
    private final double annualBonus;
    /**
     * 构造函数
     * @param fullName 姓名
     * @param basicSalary 月薪
     * @param annualBonus 年终奖
     */
    public GeneralStaff(String fullName, double basicSalary, double annualBonus) {
        super(fullName, basicSalary);
        this.annualBonus = annualBonus;
    }

    public double getAnnualSalary() {
        double annualBasicSalary = this.getAnnualBasicSalary();
        return annualBasicSalary + this.annualBonus;
    }
}