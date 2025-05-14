package com.pingwit.part7.homework.task3;

import com.pingwit.part7.homework.task2.Person;

import java.util.Arrays;

public class PersonArray {
    public static void main(String[] args) {
        Person[] persons = {new Person("Egorka", 25), new Person("Olya", 25)};

        System.out.println(Arrays.toString(persons));
    }
}
