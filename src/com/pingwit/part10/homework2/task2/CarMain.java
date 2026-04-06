package com.pingwit.part10.homework2.task2;

public class CarMain {
    public static void main(String[] args) {

        Engine engine = new Engine();
        Gearbox gearbox = new Gearbox();
        Car car = new Car(engine, gearbox);
        //Car car2 = new Car(new Engine(), new Gearbox());
        //Car car3 = new Car(new Engine(), gearbox);

        car.shiftUp();
        car.startEngine();
        car.shiftDown();
        car.shiftUp();
        car.stopEngine();
        car.stopEngine();
        car.shiftUp();
        car.shiftUp();
        car.shiftDown();
    }
}
