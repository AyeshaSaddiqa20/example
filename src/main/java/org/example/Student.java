package org.example;

// Define a subclass called Student
public class Student extends Person {
    private int studentId;

    // Constructor
    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    // Getter and setter for studentId attribute
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
