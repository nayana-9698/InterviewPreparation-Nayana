package Practice;

public class PrimeNumbers {

    public static void main(String[] args) {
        // Loop through numbers from 2 to 100
        System.out.println("Prime numbers between 1 and 100 are:");
        for (int num = 2; num <= 100; num++) {
            // Check if the number is prime
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // A number less than 2 is not prime
        if (num < 2) {
            return false;
        }
        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisors found, it is prime

    }
}
