package com.pingwit.part8.homework.task3;

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

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getResidents() {
        return residents;
    }

    public void setResidents(int residents) {
        this.residents = residents;
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }

    public void setHeatingOn(boolean heatingOn) {
        this.heatingOn = heatingOn;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    private boolean shouldTurnOnHeating(int minFloors, int minResidents) {
        return floors > minFloors && residents > minResidents;
    }

    public void turnOnHeating(int minFloors, int minResidents) {
        if (shouldTurnOnHeating(minFloors, minResidents)) {
            heatingOn = true;
            System.out.println("Отопление было включено в доме типа: " + getHouseType().getType() + " с " + floors + " этажами и " + residents + " жильцами.");
        }
    }


    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", residents=" + residents +
                ", heatingOn=" + heatingOn +
                ", houseType='" + houseType + '\'' +
                '}';
    }
}
