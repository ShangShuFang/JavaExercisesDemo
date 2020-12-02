package com.shangshufang.homework.step2.knowledge9002_04.demo1;

/**
 * 主管
 */
public class Manager extends Employee {
    private final double annualBonus;
    private final double postAllowance;
    /**
     * 构造函数
     * @param fullName 姓名
     * @param basicSalary 月薪
     * @param postAllowance 月岗位津贴
     * @param annualBonus 年终奖
     */
    public Manager(String fullName, double basicSalary, double postAllowance, double annualBonus) {
        super(fullName, basicSalary);
        this.annualBonus = annualBonus;
        this.postAllowance = postAllowance;
    }

    public double getAnnualSalary() {
        double annualBasicSalary = this.getAnnualBasicSalary();
        double annualPostAllowance = this.getAnnualPostAllowance();
        return annualBasicSalary + annualPostAllowance + this.annualBonus;
    }

    private double getAnnualPostAllowance() {
        return this.postAllowance * 12;
    }
}