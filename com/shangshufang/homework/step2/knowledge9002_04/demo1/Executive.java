package com.shangshufang.homework.step2.knowledge9002_04.demo1;

/**
 * 总经理
 */
public class Executive extends Employee {
    private final double annualBonus;
    private final double postAllowance;
    private final int sharesCount;

    /**
     * 构造函数
     * @param fullName 姓名
     * @param basicSalary 月薪
     * @param postAllowance 月岗位津贴
     * @param annualBonus 年终奖
     * @param sharesCount 股份数量
     */
    public Executive(String fullName, double basicSalary, double postAllowance, double annualBonus, int sharesCount) {
        super(fullName, basicSalary);
        this.annualBonus = annualBonus;
        this.postAllowance = postAllowance;
        this.sharesCount = sharesCount;
    }

    public double getAnnualSalary() {
        double annualBasicSalary = this.getAnnualBasicSalary();
        double annualPostAllowance = this.getAnnualPostAllowance();
        double annualSharesPrice = this.getSharesPrice();
        return annualBasicSalary + annualPostAllowance + this.annualBonus + annualSharesPrice;
    }

    private double getAnnualPostAllowance() {
        return this.postAllowance * 12;
    }

    private double getSharesPrice() {
        double sharePrice = 58.50;
        return this.sharesCount * sharePrice;
    }
}