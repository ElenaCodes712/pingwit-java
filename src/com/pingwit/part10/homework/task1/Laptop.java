package com.pingwit.part10.homework.task1;

public class Laptop implements Computer {

    @Override
    public void turnOn() {
        System.out.println("Your laptop is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Your laptop is turned off");

    }

    @Override
    public void reset() {
        System.out.println("You have reset your laptop");
    }
}
