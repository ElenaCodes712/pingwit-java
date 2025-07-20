package com.pingwit.part9.homework.task2;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private Gender gender;
    private MaritalStatus maritalStatus;

    public Person(String firstName, String lastName, int birthYear, Gender gender, MaritalStatus maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Gender getGender() {
        return gender;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }
}
