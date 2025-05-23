package com.pingwit.part7.homework.task4;

import java.util.Scanner;

public class InsuranceCosts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите объем двигателя в см3: ");
        int engineVolume = scanner.nextInt();

        System.out.println("Были ДТП за прошлый год (да = true / нет = false)? ");
        Boolean accident = scanner.nextBoolean(); // метод nextBoolean() возвращает boolean, т.е. примитив. Поэтому правильнее будет Boolean accident -> boolean accident, хотя это не критично

        System.out.println("Страховались у нас (да = true / нет = false)? ");
        Boolean formerCustomer = scanner.nextBoolean(); // метод nextBoolean() возвращает boolean, т.е. примитив. Поэтому правильнее будет Boolean accident -> boolean accident, хотя это не критично

        double engineVolumeRate = 0.25;
        double insuranceCosts = engineVolume * engineVolumeRate;
        double costsWithDiscount; // давай уберем эту переменную и постепенно будем изменять insuranceCosts
        double totalCosts; // давай уберем эту переменную и постепенно будем изменять insuranceCosts

        // accident -> hasAccidents будет ярче указывать на то, что это скорее всего переменная boolean.
        // внутри условия if должно быть boolean выражение, твой код будет работать корректно, но переменная accident типа boolean, поэтому твой код можно упростить до if (accident)
        if (accident == true) {
            double discountRate = 1.2; // discountRate звучит как скидка, это скорее accidentAdditionalRate
            costsWithDiscount = insuranceCosts * discountRate;
        } else {
            costsWithDiscount = insuranceCosts;
        }

        if (formerCustomer == true) { // if (formerCustomer == true) -> if (formerCustomer). Подробнее описал выше
            double customerDiscount = 0.8;
            totalCosts = costsWithDiscount * customerDiscount;
        } else {
            totalCosts = costsWithDiscount;
        }

        System.out.println("Ваш полис стоит " + totalCosts + " евро.");
    }
}
