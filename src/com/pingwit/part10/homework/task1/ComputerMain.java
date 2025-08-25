package com.pingwit.part10.homework.task1;

public class ComputerMain {
    public static void main(String[] args) {

        Computer laptop = new Laptop();
        Computer mac = new Mac();

        laptop.turnOn();
        laptop.turnOff();
        laptop.reset();
        mac.turnOn();
        mac.turnOff();
        mac.reset();
    }
}
