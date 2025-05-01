package com.pingwit.part4.homework.task8;

public class SumOfOddAndEvenNumbers {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            } else {
                sumEven += i;
            }
        }
        sum = sumEven + sumOdd;

        System.out.println("Sum of odd numbers is: " + sumOdd);
        System.out.println("Sum of even nubmers is: " + sumEven); // nubmers -> опечатка
        System.out.println("Sum of all numbers is: " + sum);
    }
}
