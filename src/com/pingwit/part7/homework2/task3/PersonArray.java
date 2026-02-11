package com.pingwit.part7.homework2.task3;

import com.pingwit.part7.homework2.task2.Person;
import java.util.Arrays;

public class PersonArray {
    public static void main(String[] args) {
        Person[] persons = {new Person("Tanya", 28), new Person()};

        System.out.println(Arrays.toString(persons));
    }
}
