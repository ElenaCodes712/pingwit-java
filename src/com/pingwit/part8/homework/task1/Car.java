package com.pingwit.part8.homework.task1;

public class Car {
    private String brand;
    private String model;
    private int doors;

    public Car(String brand, String model, int doors) {
        this.brand = brand;
        this.model = model;
        this.doors = doors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public void openDoors() {
        for (int i = 1; i <= doors; i++) {
            System.out.println("Дверь " + i + " открыта");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                '}';
    }
}
