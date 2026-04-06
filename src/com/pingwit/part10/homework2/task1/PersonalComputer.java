package com.pingwit.part10.homework2.task1;

public class PersonalComputer implements Computer {
    @Override
    public void turnOn() {
        System.out.println("You have turned on your personal computer");
    }

    @Override
    public void turnOff() {
        System.out.println("You have turned off your personal computer");
    }

    @Override
    public void reset() {
        System.out.println("You have reset your personal computer");
    }
}
