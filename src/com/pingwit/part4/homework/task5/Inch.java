package com.pingwit.part4.homework.task5;

public class Inch {
    public static void main(String[] args) {
        double inchInCm = 2.54;
        double cm;

        for (int i = 1; i <= 20; i++) {
            cm = i * inchInCm;
            System.out.println(i + " inch = " + cm + " cm");
        }
    }
}
