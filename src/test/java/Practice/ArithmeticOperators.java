package Practice;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a =10, b = 5, c = 15;
        // Arithmetic operators
        System.out.println("Arithmetic operators : ");
        System.out.println("Addition of a and b is :"+ (a+b));
        System.out.println("Subtraction of a and b is :"+ (a-b));
        System.out.println("Multiplication of a and b is :"+ (a*b));
        System.out.println("Division of a and b is :"+ (a/b));
        System.out.println("Modulus of a and b is :"+ (a%b));
        System.out.println("----------------------------------");

        System.out.println("Post Increment of a:"+ (a++));  // post increment
        System.out.println(("a value is "+ a));
        System.out.println("Post Decrement of b :"+ (b--)); // post decrement
        System.out.println(("b value is "+ b));
        System.out.println("Power of a and b is :"+ (a^b));
        System.out.println("---------------------------------");

        System.out.println("Pre Increment:"+ (++a)); //pre increment
        System.out.println(("a value is "+ a));
        System.out.println("Pre Decrement:"+ (--b)); // pre decrement
        System.out.println(("b value is "+ b));
        System.out.println(" ");
    }
}
