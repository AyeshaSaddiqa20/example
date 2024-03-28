package org.example;

import java.util.Scanner;

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); // Variable name changed: scanner to inputScanner
        System.out.print("Enter student's name: ");
        String studentName = inputScanner.nextLine(); // Variable name changed: name to studentName
        System.out.print("Enter student's ID: ");
        int studentIdentifier = inputScanner.nextInt(); // Variable name changed: studentId to studentIdentifier
        Student student = new Student(studentName, studentIdentifier);
        System.out.println("Student's name: " + student.getName());
        inputScanner.close();
    }
}
