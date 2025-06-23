package com.example.contactmanagementsystem.model;

public class Company extends Contact{
    private String companyName;

    public Company(String companyName, String address) {
        this.name = companyName;
        this.address = address;
    }
    @Override
    public String getType() {
        return "Company";
    }
}
