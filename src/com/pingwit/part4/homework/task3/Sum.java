package com.pingwit.part4.homework.task3;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 256 ; i *= 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
