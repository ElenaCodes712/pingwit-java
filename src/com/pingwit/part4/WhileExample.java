package com.pingwit.part4;

public class WhileExample {
    public static void main(String[] args) {
        int i = 1;

        while (i < 10){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Happy end");
    }
}
