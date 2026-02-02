package com.pingwit.part4.homework.task9;

public class Rhombus {
    public static void main(String[] args) {
        int height = 7;
        int center = height / 2;

        for (int i = 0; i < height; i++) {
            int line = i < center ? i : height - 1 - i;

            for (int j = 0; j < height - 1; j++) {
                if (j >= center - line && j <= center + line - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
