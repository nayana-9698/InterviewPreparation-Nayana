package Practice;

import java.util.Scanner;

public class CalculatorProg {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking user inputs for addition
        System.out.print("Enter first number for addition: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number for addition: ");
        double num2 = scanner.nextDouble();
        //output
        double addition = num1 + num2;
        System.out.println("Addition of num1 and num2 is : " + addition);

        // Taking user inputs for subtraction
        System.out.print("Enter first number for subtraction: ");
        double sub1 = scanner.nextDouble();
        System.out.print("Enter second number for subtraction: ");
        double sub2 = scanner.nextDouble();
        //output
        double subtraction = sub1 - sub2;
        System.out.println("Subtraction of num1 and num2 is : " + subtraction);

        // Taking user inputs for multiplication
        System.out.print("Enter first number for multiplication: ");
        double mul1 = scanner.nextDouble();
        System.out.print("Enter second number for multiplication: ");
        double mul2 = scanner.nextDouble();
        //output
        double multiplication = num1 * num2;
        System.out.println("Multiplication of num1 and num2 is : " + multiplication);

        // Taking user inputs for division
        System.out.print("Enter first number for division: ");
        double div1 = scanner.nextDouble();
        System.out.print("Enter second number for division: ");
        double div2 = scanner.nextDouble();
        //output
        double division = num1 / num2;
        System.out.println("Division of num1 and num2 is : " + division);

        // Taking user inputs for modulus
        System.out.print("Enter first number for modulus: ");
        double mod1 = scanner.nextDouble();
        System.out.print("Enter second number for modulus: ");
        double mod2 = scanner.nextDouble();
        //output
        double modulus = num1 % num2;
        System.out.println("Modulus of num1 and num2 is : " + modulus);
        System.out.println(" ");

        // Displaying output
        System.out.println("Output for all calculator operations are :");
        System.out.println("Addition of num1 and num2 is : " + addition);
        System.out.println("Subtraction of num1 and num2 is : " + subtraction);
        System.out.println("Multiplication of num1 and num2 is : " + multiplication);
        System.out.println("Division of num1 and num2 is : " + division);
        System.out.println("Modulus of num1 and num2 is : " + modulus);


    }

}
