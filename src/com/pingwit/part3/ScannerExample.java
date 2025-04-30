package com.pingwit.part3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
    }
}
