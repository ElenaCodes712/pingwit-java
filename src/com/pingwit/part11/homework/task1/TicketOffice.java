package com.pingwit.part11.homework.task1;

public class TicketOffice {
    //ОПЦИОНАЛЬНО: в идеальном мире можно сделать метод не void, а вернуть что-нибудь вроде FerryPayment, внутри которого 2 поля: totalPayment и totalPassengers
    // затем полученную информацию распечатать в методе main() --> пока оставлю так, после повторения лекций вернусь к опциональному пункту
    public void calculatePayment(Vehicle[] vehicles) {
        int totalPassengers = 0;
        int totalPayment = 0;
        //Константы тарифов лучше сделать private static final на уровне класса, а не внутри метода.
        final int PAYMENT_TRUCK = 30;
        final int PAYMENT_PASSENGER = 10;
        final int PAYMENT_PASSENGER_OPTION_TWO = 15;

        for (Vehicle v : vehicles) {
            totalPassengers += v.getPassengers();

            if (v.getType() == VehicleType.TRUCK) {
                totalPayment += PAYMENT_TRUCK;
            } else if (v.getType() == VehicleType.PASSENGER && v.getPassengers() <= 2) {
                totalPayment += PAYMENT_PASSENGER;
            } else if (v.getType() == VehicleType.PASSENGER && v.getPassengers() > 2) {
                totalPayment += PAYMENT_PASSENGER_OPTION_TWO;
            } else {
                throw new IllegalArgumentException("Unknown vehicle type");//Исключение делать информативнее: добавить тип.
            }
        }

        System.out.println("Общая сумма оплаты: " + totalPayment + " евро");
        System.out.println("Количество пассажиров: " + totalPassengers);
    }
}



