package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Adding multiple variables
        System.out.print("Enter student's first name: ");
        String firstName = inputScanner.nextLine();
        System.out.print("Enter student's last name: ");
        String lastName = inputScanner.nextLine();
        System.out.print("Enter student's ID: ");
        int studentId = inputScanner.nextInt();

        // Merging variables into a single variable
        String studentInfo = firstName + " " + lastName;

        inputScanner.close();

        System.out.println("Student's info: " + studentInfo + ", Student's ID: " + studentId);
    }
}
