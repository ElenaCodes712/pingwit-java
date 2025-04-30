package com.pingwit.part4.homework.task2;

public class Amoeba {
    public static void main(String[] args) {
        int quantity = 1;

        for (int h = 1; h <= 24; h += 3) {
            quantity = quantity * 2;
            System.out.println(quantity);
        }
    }
}

