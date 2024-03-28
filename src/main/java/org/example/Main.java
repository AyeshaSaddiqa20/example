package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String studentName = inputScanner.nextLine();
        System.out.print("Enter student's ID: ");
        int studentIdentifier = inputScanner.nextInt();
        inputScanner.close();

        System.out.println("Student's name: " + studentName + ", Student's ID: " + studentIdentifier);
    }
}
