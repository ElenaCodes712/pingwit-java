package com.pingwit.part7.homework2.task2;

public class Person {
    String name;
    int age;

    static {
        System.out.println("You created a new instance of the class");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        name = "Egorka";
        age = 30;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
