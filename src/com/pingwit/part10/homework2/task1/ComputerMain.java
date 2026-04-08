package com.pingwit.part10.homework2.task1;

public class ComputerMain {
    public static void main(String[] args) {

        Computer personalComputer = new PersonalComputer();
        Computer workComputer = new WorkComputer();


        personalComputer.turnOn();
        personalComputer.turnOff();
        personalComputer.reset();
        workComputer.turnOn();
        workComputer.turnOff();
        workComputer.reset();
    }
}
