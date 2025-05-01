package InterviewPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize result
        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output the result
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

