package org.example;

import java.util.Scanner;

// Renamed class from Main to StudentManagementSystem
public class StudentManagementSystem {

    // Renamed method from main to start
    public static void start(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Student student = new Student();
        student.setName(getStudentName(inputScanner));
        student.setStudentID(getStudentID(inputScanner));
        inputScanner.close();

   //     System.out.println("Student's name: " + student.getName() + ", Student's ID: " + student.getStudentID());
    }

    // Extracted method to get student's name
    private static String getStudentName(Scanner scanner) {
        System.out.print("Enter student's name: ");
        return scanner.nextLine();
    }

    // Extracted method to get student's ID
    private static String getStudentID(Scanner scanner) {
        System.out.print("Enter student's ID: ");
        return scanner.nextLine();
    }
}
