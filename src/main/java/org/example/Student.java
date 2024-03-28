package org.example;
// Split variable studentIdentifier into firstName and lastName
public class Student {
    private String firstName;
    private String lastName;
    private String studentID;

    // Change variable type from int to String for studentID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Change variable type from int to String for studentID
    public String getStudentID() {
        return studentID;
    }

    // Change variable type from int to String for studentID
    public void setName(String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Rename attribute studentID to studentIdentifier
    public String getStudentIdentifier() {
        return firstName + lastName + studentID;
    }
}
