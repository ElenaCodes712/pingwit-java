package com.pingwit.part7.homework.task4;

import java.util.Scanner;

public class InsuranceCosts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите объем двигателя в см3: ");
        int engineVolume = scanner.nextInt();

        System.out.println("Были ДТП за прошлый год (да = true / нет = false)? ");
        Boolean accident = scanner.nextBoolean();

        System.out.println("Страховались у нас (да = true / нет = false)? ");
        Boolean formerCustomer = scanner.nextBoolean();

        double engineVolumeRate = 0.25;
        double insuranceCosts = engineVolume * engineVolumeRate;
        double costsWithDiscount;
        double totalCosts;

        if (accident == true) {
            double discountRate = 1.2;
            costsWithDiscount = insuranceCosts * discountRate;
        } else {
            costsWithDiscount = insuranceCosts;
        }

        if (formerCustomer == true) {
            double customerDiscount = 0.8;
            totalCosts = costsWithDiscount * customerDiscount;
        } else {
            totalCosts = costsWithDiscount;
        }

        System.out.println("Ваш полис стоит " + totalCosts + " евро.");
    }
}
