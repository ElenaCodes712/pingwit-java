package com.pingwit.part9.homework.task2;

import java.time.LocalDate;

public class PersonDataCheckService {
    private static final int LEGAL_AGE = 18; //после полей класса ставим абзац
    public void datingSuggestion(Person person) {

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - person.getBirthYear();

        if (age >= LEGAL_AGE && person.getMaritalStatus() == MaritalStatus.SINGLE) {
            if (person.getGender() == Gender.FEMALE) {
                System.out.println("Уважаемая " + person.getFirstName() + ", мы поможем вам найти мужчину мечты!");
            } else if (person.getGender() == Gender.MALE) {
                System.out.println("Уважаемый " + person.getFirstName() + ", желаете ли познакомиться с девушкой?");
            }
        }
    }
}
