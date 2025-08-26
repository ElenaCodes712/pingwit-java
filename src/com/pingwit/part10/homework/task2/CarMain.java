package com.pingwit.part10.homework.task2;

public class CarMain {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Gearbox gearbox = new Gearbox();
        Car car = new Car(engine, gearbox);

        /*Управление двигателем и коробкой только через методы автомобиля. Представь что у тебя
         Car car = new Car(new Engine(), new Gearbox());
         Получается нету прямых ссылок на engine и gearbox, а управлять автомобилем надо :)
         */
        car.drive();
        car.startEngine();
        car.drive();
        gearbox.shiftUp();
        car.changeSpeed();
        gearbox.shiftUp();
        car.changeSpeed();
        gearbox.shiftUp();
        car.changeSpeed();
        gearbox.shiftUp();
        car.changeSpeed();
        gearbox.shiftUp();
        car.changeSpeed();
        gearbox.shiftUp();
        car.changeSpeed();
        gearbox.shiftUp();
        car.changeSpeed();
        gearbox.shiftUp();
        car.changeSpeed();
        gearbox.shiftDown();
        car.changeSpeed();
        car.stopEngine();
    }
}
