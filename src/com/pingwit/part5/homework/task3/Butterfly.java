package com.pingwit.part5.homework.task3;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the size of the butterfly: ");
        int height = scanner.nextInt();
        int width = height;
        int center = height / 2;

        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= width; j++) {
                if ((j - i <= 0 && j + i <= height && j <= center) || (j + i >= height && j - i >= 0 && j >= center))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
