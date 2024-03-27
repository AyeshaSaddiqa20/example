package org.example;
import java.util.Scanner;

// Main class
public class Main {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's input (name) from the console
        String name = scanner.nextLine();

        // Call the welcomeUser method from the GreetingUtility class and pass the user's name as an argument
        GreetingUtility.welcomeUser(name); // Updated method call from Greeting.greetUser to GreetingUtility.welcomeUser

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}