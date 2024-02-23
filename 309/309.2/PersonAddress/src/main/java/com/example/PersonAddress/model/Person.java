package com.example.PersonAddress.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {
    private static final Logger log = LogManager.getLogger(Person.class);
    private String name;
    private String street;
    private String town;
    private String zip;
    public Person() {
        log.trace("Trace msg from no args Person constructor");
        log.debug("Debug msg from no args Person constructor");
        log.info("Info msg from no args Person constructor");
        log.fatal("Info msg from no args Person constructor");
        log.error("Info msg from no args Person constructor");
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
