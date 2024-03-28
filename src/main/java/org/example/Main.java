package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String studentFullName = inputScanner.nextLine();
        String[] nameParts = studentFullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts.length > 1 ? nameParts[1] : "";
        System.out.print("Enter student's ID: ");
        int studentIdentifier = inputScanner.nextInt();
        inputScanner.close();

        System.out.println("Student's first name: " + firstName);
        System.out.println("Student's last name: " + lastName);
        System.out.println("Student's ID: " + studentIdentifier);
    }
}
