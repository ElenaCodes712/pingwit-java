package com.pingwit.part10.homework.task2;

public class Car {
    private static final int SPEED_PER_GEAR = 20;

    private Engine engine;
    private Gearbox gearbox;
    private int speed;

    public Car(Engine engine, Gearbox gearbox) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.speed = 0; // а что будет если удалить эту строку?
    }

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    //у автомобиля есть методы startEngine, stopEngine. Еще необходимо добавить управление коробкой, например, shiftUp и shiftDown
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
            return; // что будет если отсюда убрать return?
        } else {
            changeSpeed();
        }
    }
}
