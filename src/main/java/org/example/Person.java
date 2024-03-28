package org.example;
// Extracted class Person from Student
public class Person {
    private String first;
    private String last;

    // Extracted method to set person's name
    public void setName(String firstName, String lastName) {
        this.first = firstName;
        this.last = lastName;
    }

    // Extracted method to get person's name
    public String getName() {
        return first + " " + last;
    }
}
