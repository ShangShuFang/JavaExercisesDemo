package com.shangshufang.homework.step1.knowledge9001_10;

/**
 * Java运算符-赋值运算符
 */
public class Demo2 {
    public static void main(String[] args) {
        //简单的赋值运算符，将右操作数的值赋给左侧操作数
        double januaryIncome = 68500; //一月份收入
        double februaryIncome = 53690; //而月份收入
        double marchIncome = 72900; //三月份收入
        double aprilIncome = 61860; //四月份收入
        double mayIncome = 89800; //五月份收入
        double juneIncome = 96880; //六月份收入
        double halfYearIncome = januaryIncome + februaryIncome + marchIncome + aprilIncome + mayIncome + juneIncome;

        //加等赋值操作符，它把左操作数和右操作数相加赋值给左操作数
        double extraIncome = 13896.50;//遗漏的额外收入
        halfYearIncome += extraIncome;
        System.out.println("上半年营业总收入：" + halfYearIncome);

        //乘等赋值操作符，它把左操作数和右操作数相乘赋值给左操作数
        halfYearIncome *= 0.97; //按照3%交税后的收入
        System.out.println("上半年税后收入：" + halfYearIncome);

        //投入成本
        double cost = 82690;
        System.out.println("上半年运营成本：" + cost);

        //上半年公司盈利
        halfYearIncome -= cost;
        System.out.println("上半年公司盈利：" + halfYearIncome);

        //除等赋值操作符，它把左操作数和右操作数相除赋值给左操作数
        int persenCount = 3;
        halfYearIncome /= persenCount;
        System.out.println("平均每位股东人收入：" + halfYearIncome);
    }
}