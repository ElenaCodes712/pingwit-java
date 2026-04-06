package com.pingwit.part10.homework2.task2;

public class Car {
    private static final int SPEED_PER_GEAR = 20;

    private Engine engine;
    private Gearbox gearbox;

    public Car(Engine engine, Gearbox gearbox) {
        this.engine = engine;
        this.gearbox = gearbox;
    }

    public void startEngine() {
        engine.startTheEngine();
    }

    public void stopEngine() {
        engine.stopTheEngine();
        gearbox.setNeutral();
    }

    public void shiftUp() {
        if (engine.isRunning()) {
            gearbox.shiftGearUp();
        } else {
            System.out.println("Your engine is not running");
        }
    }

    public void shiftDown() {
        if (engine.isRunning()) {
            gearbox.shiftGearDown();
        } else {
            System.out.println("Your engine is not running");
        }
    }

    public int getCurrentSpeed() {
        if (engine.isRunning()) {
            int gear = gearbox.getCurrentGear();
            return gear * SPEED_PER_GEAR;
        } else {
            System.out.println("Your car is not running");
            return 0;
        }
    }
}
