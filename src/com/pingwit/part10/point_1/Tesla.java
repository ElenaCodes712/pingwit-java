package com.pingwit.part10.point_1;

public class Tesla implements Car, ElectricEngine {

    private static final String PRODUCER = "Tesla";

    @Override
    public void move() {
        System.out.println("Tesla is moving");
    }

    @Override
    public String getProducer() {
        return PRODUCER;
    }

    @Override
    public void openDoor() {
        System.out.println("Tasla's door is opened");
    }
}
