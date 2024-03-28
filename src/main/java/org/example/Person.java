package org.example;

// Define a superclass called Person
public class Person {
    protected String name;
    private int studentNumber; // Moved attribute

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

    // Getter and setter for studentNumber attribute
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}