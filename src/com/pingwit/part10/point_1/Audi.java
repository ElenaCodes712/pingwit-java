package com.pingwit.part10.point_1;

public class Audi implements Car {

    private static final String PRODUCER = "Audi";

    private int currentTransmission = 0;

    @Override
    public void move() {
        System.out.println("Audi is moving");
    }

    @Override
    public String getProducer() {
        return PRODUCER;
    }

    public int getCurrentTransmission(){
        return currentTransmission;
    }

    @Override
    public void openDoor() {
        Car.super.openDoor();
    }
}
