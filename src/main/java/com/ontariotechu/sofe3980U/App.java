package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    /**
     * Main program: The entry point of the program. The local time will be printed first,
     * then it will create two binary variables, perform operations (OR, AND, Multiply, and Add),
     * and print the results.
     *
     * @param args: not used
     */
    public static void main(String[] args) {
        // Print the current local time
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first binary number
        System.out.println("Enter the first binary number:");
        String input1 = scanner.nextLine();
        Binary binary1 = new Binary(input1);

        // Prompt the user to enter the second binary number
        System.out.println("Enter the second binary number:");
        String input2 = scanner.nextLine();
        Binary binary2 = new Binary(input2);

        // Perform operations
        Binary sum = Binary.add(binary1, binary2);
        Binary orResult = Binary.OR(binary1, binary2);
        Binary andResult = Binary.AND(binary1, binary2);
        Binary multiplyResult = Binary.multiply(binary1, binary2);

        // Display results
        System.out.println("\nResults:");
        System.out.println("First binary number: " + binary1.getValue());
        System.out.println("Second binary number: " + binary2.getValue());
        System.out.println("Sum: " + sum.getValue());
        System.out.println("OR: " + orResult.getValue());
        System.out.println("AND: " + andResult.getValue());
        System.out.println("Multiply: " + multiplyResult.getValue());

        // Close the scanner
        scanner.close();
    }
}
