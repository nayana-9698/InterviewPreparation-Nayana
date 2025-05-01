package Practice;

import java.util.Scanner;

public class ScanInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide an integer value");
        int a = scan.nextInt();
        System.out.println("Please enter a double value");
        double b = scan.nextDouble();
        System.out.println("Sum of integer and double is : " + (a+b) );

        System.out.println("Please provide the comments : ");
        String c = scan.nextLine();
        System.out.println("Comments are:" +c);

    }
}