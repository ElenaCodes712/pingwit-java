package com.pingwit.part6;

import java.util.Arrays;

public class ForEachArrayExample {
    public static void main(String[] args) {
        String[] names = {"Egorka", "Olya", "Alex"};

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
