package com.pingwit.part3;

import java.sql.SQLOutput;

public class SwitchExample {
    public static void main(String[] args) {
        int number = 7;

        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Unexpected month");
        }

        switch (number) {
            case 1 -> System.out.println("Java 17: January");
            case 2 -> System.out.println("Java 17: February");
            case 3 -> System.out.println("Java 17: March");
            case 4 -> System.out.println("Java 17: April");
            case 5 -> System.out.println("Java 17: May");
            case 6 -> System.out.println("Java 17: June");
            case 7 -> System.out.println("Java 17: July");
            case 8 -> System.out.println("Java 17: August");
            case 9 -> System.out.println("Java 17: September");
            case 10 -> System.out.println("Java 17: October");
            case 11 -> System.out.println("Java 17: November");
            case 12 -> System.out.println("Java 17: December");


            default -> System.out.println("Unexpected month");
        }
    }
}

