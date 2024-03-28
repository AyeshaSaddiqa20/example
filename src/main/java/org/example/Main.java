package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String studentInfo = inputScanner.nextLine(); // Merged variable to store both name and ID
        inputScanner.close();

        System.out.println("Student's name and ID: " + studentInfo);
    }
}
