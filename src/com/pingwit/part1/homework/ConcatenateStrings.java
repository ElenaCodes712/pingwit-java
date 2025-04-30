package com.pingwit.part1.homework;

public class ConcatenateStrings {
    public static void main(String[] args) {
        int num_1 = 10;
        int num_2 = 5;
        int result = num_1 + num_2;
        String text = "Sum of two numbers is: "; // текст для System.out.println можно не выносить в отдельную переменную
        System.out.println(text + result);
    }
}
