package com.pingwit.part3.homework;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dollar amount: ");
        int amountInDollars = scanner.nextInt();

        System.out.println("Enter the desired currency: (1 = Euro, 2 = Zloty, 3 = Ruble)");
        int currencyId = scanner.nextInt();

        double Euro = 0.95;
        double Zloty = 4.01;
        double Ruble = 91;

        switch (currencyId){
            case 1 -> System.out.println(amountInDollars * Euro); // 0,96 - это магическое_число, т.е. сразу непонятно что это такое. Такие числа стоит выносить в отдельную переменную, например, eurRate
            case 2 -> System.out.println(amountInDollars * Zloty); // магическое_число
            case 3 -> System.out.println(amountInDollars * Ruble); // магическое_число
            default -> System.out.println("Unexpected currency");
        }
    }
}
