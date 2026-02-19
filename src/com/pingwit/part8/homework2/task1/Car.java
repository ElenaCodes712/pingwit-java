package com.pingwit.part8.homework2.task1;

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

    public void openAudiDoors() {//твой Car может быть не только Audi, но и, например, BMW, поэтому просто openDoors()
        if (!"Audi".equals(brand)) { // а вот этот if() с проверкой на Audi стоит перенести в класс CarArray внутрь цикла вызова метода открытия дверей
            return;
        } else {
            System.out.println(brand + " " + model + ":");
            for (int i = 1; i <= doors; i++) {
                System.out.println("Дверь " + i + " открыта");
            }
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



