package com.pingwit.part4.homework2.task9;

public class Rhombus {
    public static void main(String[] args) {
        int middleOfRhombus = 4;

        for (int i = 1; i <= middleOfRhombus; i++) {
            for (int j = 0; j < middleOfRhombus - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = middleOfRhombus - 1; i >= 1; i--) {
            for (int j = 1; j <= middleOfRhombus - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
