package com.shangshufang.homework.step2.knowledge9002_06.demo2;

/**
 * Java面向对象-多态-重载
 */
public class Demo2 {
    public static void main(String[] args) {
        NotebookComputer macbookpro = new NotebookComputer("MacBook Pro");
        NotebookComputer macbook = new NotebookComputer("MacBook");
        NotebookComputer matebook = new NotebookComputer("MateBook Pro");

        PersonalComputer ibmPC = new PersonalComputer("IBM");
        PersonalComputer lenovoPC = new PersonalComputer("Lenovo");

        macbookpro.start();
        macbookpro.openSoftware("Word");
        macbookpro.openSoftware("V", "邮件");
        macbookpro.turnOff();
        
        macbook.start();
        macbook.openSoftware("S", "VS Code");
        macbook.turnOff();

        matebook.start();
        matebook.openSoftware("C", "QQ");
        matebook.turnOff();

        ibmPC.start();
        ibmPC.openSoftware("Excel");
        ibmPC.openSoftware("C", "Excel");
        ibmPC.turnOff();

        lenovoPC.start();
        lenovoPC.openSoftware("PPT");
        lenovoPC.openSoftware("C", "PPT");
        lenovoPC.turnOff();

    }
}
