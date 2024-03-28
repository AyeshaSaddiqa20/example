package org.example;

// Define a superclass called Person
public class Person {
    protected String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter and setter for name attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // New method to be extracted and moved
    public void printPersonInformation() {
        System.out.println("Person's name: " + getName());
        // Add more information if needed
    }
}

