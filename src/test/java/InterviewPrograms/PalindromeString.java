package InterviewPrograms;

import java.util.Scanner;

public class PalindromeString {


    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for case-insensitive comparison
        input = input.replaceAll("\\s", "").toLowerCase();

        // Initialize a flag variable to track if it's a palindrome
        boolean isPalindrome = true;

        // Loop to check characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

}
