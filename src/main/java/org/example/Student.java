package org.example;

public class Student extends Person {
    private int studentNumber;

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void printStudentInformation() {
        System.out.println("Student's name: " + getName());
        System.out.println("Student's ID: " + getStudentNumber());
    }
}
