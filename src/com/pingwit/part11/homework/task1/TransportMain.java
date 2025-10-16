package com.pingwit.part11.homework.task1;

public class TransportMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("AB-123", VehicleType.PASSENGER, 2, 1.8);
        Vehicle v2 = new Vehicle("AG-598", VehicleType.TRUCK, 1, 7.5);
        Vehicle v3 = new Vehicle("RT-529", VehicleType.PASSENGER, 4, 1.5);
        Vehicle v4 = new Vehicle("PI-965", VehicleType.PASSENGER, 1, 2.8);
        Vehicle v5 = new Vehicle("BA-128", VehicleType.PASSENGER, 3, 1.9);

        Vehicle[] checkIn = {v1, v2, v3, v4, v5};

        TicketOffice office = new TicketOffice();
        office.calculatePayment(checkIn);

        FerryAdmission admission = new FerryAdmission();
        boolean allowed = admission.check(checkIn);

        System.out.println(allowed ? "Рейс разрешён" : "Рейс запрещён" );
    }
}
