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

        // Call the greetUser method from the Greeting class and pass the user's name as an argument
        Greeting.greetUser(name);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
