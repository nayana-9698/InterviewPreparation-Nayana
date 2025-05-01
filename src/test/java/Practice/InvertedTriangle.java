package Practice;

import java.util.Scanner;

public class InvertedTriangle {
//Write a java Program to Print a Inverted Practice.Triangle Using *?

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                // Prompt the user for the number of rows
                System.out.print("Enter the number of rows for the inverted triangle: ");
                int rows = scanner.nextInt();

                // Loop to print the inverted triangle pattern
                for (int i = rows; i >= 1; i--) {
                    // Loop to print spaces before stars
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" "); // Print spaces
                    }

                    // Loop to print stars (*)
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*"); // Print stars
                    }

                    // Move to the next line after each row
                    System.out.println();
                }

                // Close the scanner object
                scanner.close();
    }
}
