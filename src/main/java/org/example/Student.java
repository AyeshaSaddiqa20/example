package org.example;

// Define a subclass called Student
public class Student extends Person {
    private int studentNumber;

    // Constructor
    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    // Getter and setter for studentNumber attribute
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
