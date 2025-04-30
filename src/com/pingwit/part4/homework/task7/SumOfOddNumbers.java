package com.pingwit.part4.homework.task7;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
