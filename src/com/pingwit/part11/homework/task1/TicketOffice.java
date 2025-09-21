package com.pingwit.part11.homework.task1;

public class TicketOffice {
    //ОПЦИОНАЛЬНО: в идеальном мире можно сделать метод не void, а вернуть что-нибудь вроде FerryPayment, внутри которого 2 поля: totalPayment и totalPassengers
    // затем полученную информацию распечатать в методе main()
    public void calculatePayment(Vehicle[] vehicles) {
        int totalPassengers = 0;
        int totalPayment = 0;

        for (Vehicle v : vehicles) {
            totalPassengers += v.getPassengers();

            //давай вынесем все магические числа в константы класса
            if (v.getType() == VehicleType.TRUCK) {
                totalPayment += 30;
            } else if (v.getType() == VehicleType.PASSENGER & v.getPassengers() <= 2) { // лучше всегда использовать &&
                totalPayment += 10;
            } else if (v.getType() == VehicleType.PASSENGER & v.getPassengers() > 2) { // лучше всегда использовать &&
                totalPayment += 15;
            } else {
                throw new IllegalArgumentException("Unknown vehicle type");
            }
        }

        System.out.println("Общая сумма оплаты: " + totalPayment + " евро");
        System.out.println("Количество пассажиров: " + totalPassengers);
    }
}



