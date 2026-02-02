package com.pingwit.part3.homework;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dollar amount: ");
        int amountInDollars = scanner.nextInt();

        System.out.println("Enter the desired currency: (1 = Euro, 2 = Zloty, 3 = Ruble)");
        int currencyId = scanner.nextInt();

        double euro = 0.95;
        double zloty = 4.01;
        double ruble = 91;

        switch (currencyId){
            case 1 -> System.out.println(amountInDollars * euro);
            case 2 -> System.out.println(amountInDollars * zloty);
            case 3 -> System.out.println(amountInDollars * ruble);
            default -> System.out.println("Unexpected currency");
        }
    }
}
