package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String student_Name = inputScanner.nextLine();
        System.out.print("Enter student's ID: ");
        long studentIdentifier = inputScanner.nextLong(); // Changed variable type to long
        inputScanner.close();

        System.out.println("Student's name: " + student_Name + ", Student's ID: " + studentIdentifier);
    }
}
