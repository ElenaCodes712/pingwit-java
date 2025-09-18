package com.pingwit.part11.homework.task1;

public class Vehicle {
    private String carNumberPlate;
    private VehicleType type;
    private int passengers;
    private double weight;

    public Vehicle(String carNumberPlate, VehicleType type, int passengers, double weight) {
        this.carNumberPlate = carNumberPlate;
        this.type = type;
        this.passengers = passengers;
        this.weight = weight;
    }

    public String getCarNumberPlate() {
        return carNumberPlate;
    }

    public VehicleType getType() {
        return type;
    }

    public int getPassengers() {
        return passengers;
    }

    public double getWeight() {
        return weight;
    }
}
