package com.pingwit.part9.homework.task2;

public class PersonMain {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Егорка", "Свиридов", 1985, Gender.MALE, MaritalStatus.SINGLE),
                new Person("Ольга", "Блинова", 1992, Gender.FEMALE, MaritalStatus.SINGLE),
                new Person("Виолетта", "Леонидова", 1982, Gender.FEMALE, MaritalStatus.SINGLE),
                new Person("Никита", "Добрый", 1979, Gender.MALE, MaritalStatus.MARRIED),
        };

        PersonDataCheck dataCheck = new PersonDataCheck();
        for (Person person : persons) {
            dataCheck.datingSuggestion(person);
        }
    }
}
