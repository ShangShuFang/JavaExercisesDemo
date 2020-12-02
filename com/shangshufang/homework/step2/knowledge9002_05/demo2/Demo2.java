package com.shangshufang.homework.step2.knowledge9002_05.demo2;

/**
 * Java面向对象-多态-重写
 */
public class Demo2 {
    public static void main(String[] args) {
        NotebookComputer macbookpro = new NotebookComputer("MacBook Pro");
        NotebookComputer macbook = new NotebookComputer("MacBook");
        NotebookComputer matebook = new NotebookComputer("MateBook Pro");

        PersonalComputer ibmPC = new PersonalComputer("IBM");
        PersonalComputer lenovoPC = new PersonalComputer("Lenovo");

        macbookpro.start();
        macbookpro.turnOff();
        
        macbook.start();
        macbook.turnOff();

        matebook.start();
        matebook.turnOff();

        ibmPC.start();
        ibmPC.turnOff();

        lenovoPC.start();
        lenovoPC.turnOff();

    }
}
