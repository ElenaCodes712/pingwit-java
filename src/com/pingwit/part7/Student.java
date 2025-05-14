package com.pingwit.part7;

public class Student {
    static String message;
    String name;
    String surname;
    String group;
    int age;
    double height;
    Boolean expelled;
    boolean happy;

    static {
        System.out.println("Static init block 1");
    }

    static {
        System.out.println("Static init block 2");
        message = "test";
    }

    {
        System.out.println("Init block 1");
    }

    {
        System.out.println("Init block 2");
    }

    public Student(String name, String surname) {
        System.out.println("Hello from constructor");
        this.name = name;
        this.surname = surname;
        this.happy = false;
    }

    public Student(String name, int age) {
        System.out.println("Hello from constructor");
        this.name = name;
        this.age = age;
    }

    public Student() {
        this("RandomName", "RandomSurname");
        System.out.println("Hello from default constructor");
    }

    public String toString() {
        return "Hello from method toString";
    }
}

