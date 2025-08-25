package com.pingwit.part10.homework.task2;

public class Car {
    private static final int SPEED_PER_GEAR = 20;

    private Engine engine;
    private Gearbox gearbox;
    private int speed;

    public Car(Engine engine, Gearbox gearbox) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.speed = 0;
    }

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void changeSpeed() {
        int gear = gearbox.getCurrentGear();
        speed = gear * SPEED_PER_GEAR;
        if (gear == 0) {
            System.out.println("Your transmission is in neutral gear");
        } else {
            System.out.println("Your speed is " + speed);
        }
    }

    public void drive() {
        if (!engine.isRunning()) {
            System.out.println("Please start the engine");
            return;
        } else {
            changeSpeed();
        }
    }
}
