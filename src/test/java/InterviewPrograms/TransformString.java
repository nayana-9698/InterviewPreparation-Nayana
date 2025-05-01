package InterviewPrograms;

import java.util.Scanner;

public class TransformString {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input: ");
            String input = scanner.nextLine();

            if (input.length() == 0) {
                System.out.println("Output: ");
                return;
            }

            char firstChar = Character.toLowerCase(input.charAt(0));

            String rest = input.substring(1);
            StringBuilder reversed = new StringBuilder(rest).reverse();

            reversed.append(firstChar);
            System.out.println("Output: " + reversed.toString());
        }
    }

