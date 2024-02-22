package com.example.PersonAddress.model;

public class Person {
    private String name;
    private String street;
    private String town;
    private String zip;
    public Person() {
    }
    public Person(String name, String street, String town, String zip) {
        this.name = name;
        this.street = street;
        this.town = town;
        this.zip = zip;
    }

    // Getters and setters for each field
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getStreet() {
        return street;
    }
    public void setTown(String town) {
        this.town = town;
    }
    public String getTown() {
        return town;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getZip() {
        return zip;
    }
}
