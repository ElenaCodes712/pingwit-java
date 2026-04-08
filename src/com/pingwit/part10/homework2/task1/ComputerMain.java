package com.pingwit.part10.homework2.task1;

public class ComputerMain {
    public static void main(String[] args) {

        PersonalComputer personalComputer = new PersonalComputer(); // PersonalComputer personalComputer -> Computer personalComputer. Твой вариант не ошибка, но это good practice использовать интерфейс в типе переменной
        WorkComputer workComputer = new WorkComputer();// WorkComputer workComputer -> Computer workComputer.

        personalComputer.turnOn();
        personalComputer.turnOff();
        personalComputer.reset();
        workComputer.turnOn();
        workComputer.turnOff();
        workComputer.reset();
    }
}
