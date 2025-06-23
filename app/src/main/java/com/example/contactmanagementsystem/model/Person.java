package com.example.contactmanagementsystem.model;

public class Person extends Contact{
    private String surname;
    private String birthDate;

    public Person(String name, String surname, String address, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.birthDate = birthDate;
    }

    @Override
    public  String getType() {
        return "Person";
    }
    public String getSurname() {
        return surname;
    }
}
