package Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perform 5 calculations
        for (int i = 0; i < 5; i++) {
            // Take two numbers and operator from the user
            System.out.println("Enter two numbers: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            // Display operation menu
            System.out.println("Choose an operation: ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");

            // Read the operation choice
            int choice = scanner.nextInt();

            // Use switch-case to determine the operation
            double result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result of addition: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result of subtraction: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result of multiplication: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result of division: " + result);
                    } else {
                        System.out.println("Error! Division by zero.");
                    }
                    break;
                case 5:
                    result = num1 % num2;
                    System.out.println("Result of modulus: " + result);
                    break;
                default:
                    System.out.println("Invalid operation choice. Please select between 1 and 5.");
            }

            // Using while loop to repeat an operation if needed (for demonstration)
            int repeat = 1; // by default, loop runs once
            while (repeat == 1) {
                System.out.println("Do you want to perform another operation? (1 for Yes / 0 for No)");
                repeat = scanner.nextInt();
                if (repeat == 1) {
                    System.out.println("Enter new numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Choose an operation: ");
                    System.out.println("1. Addition (+)");
                    System.out.println("2. Subtraction (-)");
                    System.out.println("3. Multiplication (*)");
                    System.out.println("4. Division (/)");
                    System.out.println("5. Modulus (%)");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            result = num1 + num2;
                            System.out.println("Result of addition: " + result);
                            break;
                        case 2:
                            result = num1 - num2;
                            System.out.println("Result of subtraction: " + result);
                            break;
                        case 3:
                            result = num1 * num2;
                            System.out.println("Result of multiplication: " + result);
                            break;
                        case 4:
                            if (num2 != 0) {
                                result = num1 / num2;
                                System.out.println("Result of division: " + result);
                            } else {
                                System.out.println("Error! Division by zero.");
                            }
                            break;
                        case 5:
                            result = num1 % num2;
                            System.out.println("Result of modulus: " + result);
                            break;
                        default:
                            System.out.println("Invalid operation choice.");
                    }
                }
            }

            // Using do-while loop to keep performing operations
            int continueCalculation;
            do {
                System.out.println("Would you like to continue the calculations? (1 for Yes / 0 for No)");
                continueCalculation = scanner.nextInt();
                if (continueCalculation == 1) {
                    System.out.println("Enter new numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Choose an operation: ");
                    System.out.println("1. Addition (+)");
                    System.out.println("2. Subtraction (-)");
                    System.out.println("3. Multiplication (*)");
                    System.out.println("4. Division (/)");
                    System.out.println("5. Modulus (%)");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            result = num1 + num2;
                            System.out.println("Result of addition: " + result);
                            break;
                        case 2:
                            result = num1 - num2;
                            System.out.println("Result of subtraction: " + result);
                            break;
                        case 3:
                            result = num1 * num2;
                            System.out.println("Result of multiplication: " + result);
                            break;
                        case 4:
                            if (num2 != 0) {
                                result = num1 / num2;
                                System.out.println("Result of division: " + result);
                            } else {
                                System.out.println("Error! Division by zero.");
                            }
                            break;
                        case 5:
                            result = num1 % num2;
                            System.out.println("Result of modulus: " + result);
                            break;
                        default:
                            System.out.println("Invalid operation choice.");
                    }
                }
            } while (continueCalculation == 1);
        }

        // Close scanner resource
        scanner.close();
    }

}
