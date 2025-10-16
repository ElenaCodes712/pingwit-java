package com.pingwit.part9;

public class RecordExample {
    public static void main(String[] args) {
        Dog dog = new Dog("mops", "brown");
        Dog dogClone = new Dog("mops", "brown");

        dog.color();
        dog.type();

        System.out.println(dog.equals(dogClone));
    }
}
