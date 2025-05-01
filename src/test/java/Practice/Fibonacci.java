package Practice;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the number of terms (n) in the Practice.Fibonacci series: ");
        int n = scanner.nextInt();

        // Handle the case where n is less than or equal to 0
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("Practice.Fibonacci Series up to " + n + " terms:");

            // Initialize the first two terms of the Practice.Fibonacci sequence
            long first = 0, second = 1;

            // Loop to print the Practice.Fibonacci series up to the nth term
            for (int i = 1; i <= n; i++) {
                // Print the current term
                System.out.print(first + " ");
                // Calculate the next term in the sequence
                long nextTerm = first + second;
                first = second;  // Update first to be the previous second term
                second = nextTerm;  // Update second to be the new next term
            }
        }

        // Close the scanner object
        scanner.close();

    }
}
