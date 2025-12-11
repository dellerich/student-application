package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Person extends Object{
    protected String surName;     //фамилия
    protected String givenName;   //имя
    private String patronymic;  //отчество
    private LocalDate dateOfBirth;
    private Address address;


    public String getPersonString(){
        return surName + " " + givenName;
    }
    //Гетеры нужны для возвращения измененного значения, а сетеры, что устанавливать эти самые значения
    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
