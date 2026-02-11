package com.pingwit.part7.homework2.task4;

import java.util.Scanner;

public class InsuranceCosts {
    private static final double ENGINE_VOLUME_RATE = 0.25;
    private static final double ACCIDENT_ADDITIONAL_COSTS = 1.2;
    private static final double CUSTOMER_DISCOUNT = 0.8;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите объем двигателя в см3: ");
        int engineVolume = scanner.nextInt();

        System.out.println("Были ДТП за прошлый год (true / false)? ");
        boolean hasAccident = scanner.nextBoolean();

        System.out.println("Страховались у нас (true / false)? ");
        boolean formerCustomer = scanner.nextBoolean();

        double accidentFactor = hasAccident ? ACCIDENT_ADDITIONAL_COSTS : 1;
        double customerFactor = formerCustomer ? CUSTOMER_DISCOUNT : 1;

        double insuranceCosts = engineVolume * ENGINE_VOLUME_RATE * accidentFactor * customerFactor;

        System.out.println("Ваш полис стоит " + insuranceCosts + " евро.");
    }
}
