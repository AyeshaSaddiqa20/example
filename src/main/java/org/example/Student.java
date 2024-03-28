package org.example;

// Define a subclass called Student
public class Student extends Person {

    // Constructor
    public Student(String name, int studentNumber) {
        super(name);
        // No need to initialize studentNumber here anymore
    }

    // No need to have getter and setter for studentNumber here anymore

    // Method to be extracted
    public void printStudentInformation() {
        System.out.println("Student's name: " + getName());
        System.out.println("Student's ID: " + getStudentNumber());
        // Add more information if needed
    }
}
