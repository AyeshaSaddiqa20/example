package org.example;

import java.util.Scanner;

// Main class
public class Main {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter student's ID
        System.out.print("Enter student's ID: ");
        int studentId = scanner.nextInt();

        // Create a Student object
        Student student = new Student(name, studentId);

        // Print student's information
        System.out.println("Student's name: " + student.getName());
        System.out.println("Student's ID: " + student.getStudentId());

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
