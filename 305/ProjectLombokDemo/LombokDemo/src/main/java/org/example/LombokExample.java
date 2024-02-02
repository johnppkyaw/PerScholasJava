package org.example;
public class LombokExample {
    public static void main(String[] args) {
        //Use version 1.18.30 for Lombok if you are using JDK 21

        // Create a new Person object using the generated no-argument constructor
        Person person = new Person();

        // Set values using the generated setter methods
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(30);

        // Print the object using the generated toString() method
        System.out.println("Person details: " + person);
    }
}
