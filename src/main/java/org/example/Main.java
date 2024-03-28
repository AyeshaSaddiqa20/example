package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String studentName = inputScanner.nextLine();
        System.out.println("Enter student identifier:");
        int studentIdentifier = inputScanner.nextInt();
        System.out.println("Student's name: " + studentName);
        System.out.println("Student's identifier: " + studentIdentifier);
    }
}
