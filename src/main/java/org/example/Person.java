package org.example;
// Extracted class Person from Student
public class Person {
    private String firstName;
    private String lastName;

    // Extracted method to set person's name
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Extracted method to get person's name
    public String getName() {
        return firstName + " " + lastName;
    }
}
