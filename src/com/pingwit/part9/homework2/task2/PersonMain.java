package com.pingwit.part9.homework2.task2;

public class PersonMain {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Saveliy", "Sviridov", 1979, Gender.MALE, MaritalStatus.SINGLE),
                new Person("Violetta", "Ivanova", 1982, Gender.FEMALE, MaritalStatus.SINGLE),
                new Person("Olya", "Petrova", 1979, Gender.FEMALE, MaritalStatus.MARRIED),
                new Person("Maria", "Sidorova", 1979, Gender.FEMALE, MaritalStatus.SINGLE)
        };

        PersonDataService personDataService = new PersonDataService();
        for (Person person : persons) {
            personDataService.PersonCheck(person);
        }
    }
}
