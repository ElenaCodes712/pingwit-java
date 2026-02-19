package com.pingwit.part8.homework2.task3;

public class House {
    private int floors;
    private int residents;
    private boolean heatingOn;
    private HouseType houseType;

    public House(int floors, int residents, boolean heatingOn, HouseType houseType) {
        this.floors = floors;
        this.residents = residents;
        this.heatingOn = heatingOn;
        this.houseType = houseType;
    }

    public int getFloors() {
        return floors;
    }

    public int getResidents() {
        return residents;
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void turnOnHeating() {
        if (floors >= 5 && residents >= 10) {
            heatingOn = true;
            System.out.println("В доме типа " + getHouseType().getType() + " было включено отопление.");
        }
    }
}
