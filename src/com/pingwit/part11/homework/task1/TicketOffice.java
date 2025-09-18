package com.pingwit.part11.homework.task1;

public class TicketOffice {
    public void calculatePayment(Vehicle[] vehicles) {
        int totalPassengers = 0;
        int totalPayment = 0;

        for (Vehicle v : vehicles) {
            totalPassengers += v.getPassengers();

            if (v.getType() == VehicleType.TRUCK) {
                totalPayment += 30;
            } else if (v.getType() == VehicleType.PASSENGER & v.getPassengers() <= 2) {
                totalPayment += 10;
            } else if (v.getType() == VehicleType.PASSENGER & v.getPassengers() > 2) {
                totalPayment += 15;
            } else {
                throw new IllegalArgumentException("Unknown vehicle type");
            }
        }

        System.out.println("Общая сумма оплаты: " + totalPayment + " евро");
        System.out.println("Количество пассажиров: " + totalPassengers);
    }
}



