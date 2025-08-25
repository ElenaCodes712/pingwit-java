package com.pingwit.part10.homework.task1;

public class Mac implements Computer {

    @Override
    public void turnOn() {
        System.out.println("Your mac is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Your mac is turned off");

    }

    @Override
    public void reset() {
        System.out.println("You have reset your mac");
    }
}
