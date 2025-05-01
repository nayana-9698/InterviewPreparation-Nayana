package Practice;

public class Operators {

    public static void main(String[] args) {


        int a =10, b = 5, c = 15;

        // Arithmetic operators
        System.out.println("Arithmetic operators : ");
        System.out.println("Addition of a and b is :"+ (a+b));
        System.out.println("Subtraction of a and b is :"+ (a-b));
        System.out.println("Multiplication of a and b is :"+ (a*b));
        System.out.println("Division of a and b is :"+ (a/b));
        System.out.println("Modulus of a and b is :"+ (a%b));
        System.out.println(" ");

        System.out.println("Increment:"+ (a++));  // pre increment
        System.out.println(("a value is "+ a));
        System.out.println("Decrement:"+ (b--)); // pre decrement
        System.out.println(("b value is "+ b));
        System.out.println("Power:"+ (a^b));
        System.out.println(" ");

        System.out.println("Increment:"+ (++a)); //post increment
        System.out.println(("a value is "+ a));
        System.out.println("Decrement:"+ (--b)); // post decrement
        System.out.println(("b value is "+ b));
        System.out.println(" ");

        // Relational operators
        System.out.println("Relational operators : ");
        System.out.println("Is a equals to b : " + (a==b));
        System.out.println("Is a not equals to b : " + (a!=b));
        System.out.println("Is a greater than b : " + (a>b));
        System.out.println("Is a lesser than b : " + (a<b));
        System.out.println("Is a greater than equal to b : " + (a>=b));
        System.out.println("Is a lesser than equal to b : " + (a<=b));
        System.out.println(" ");

        //Logical operators
        System.out.println("Logical operators : ");
        System.out.println("AND: " + ((a == b) && (a == c)));
        System.out.println("OR: " + ((a == b) || (a == c)));
        System.out.println("NOT: " + !(a == b));
        System.out.println(" ");

        // Assignment operators
        System.out.println("Assignment operators : ");
        System.out.println("+=: " + (a += 5));
        System.out.println("-=: " + (a -= 5));
        System.out.println("*=: " + (a *= 5));
        System.out.println("/=: " + (a /= 5));
        System.out.println("%=: " + (a %= 5));
        System.out.println("aaa: " + a);

        //Bitwise operators
        System.out.println("Bitwise operators : ");
        System.out.println("bitwise &: "+ (a&b));
        System.out.println("bitwise |: "+ (a|b));
        System.out.println("bitwise >>: "+ (a>>2));
        System.out.println("bitwise <<: "+ (a<<2));

        System.out.println("conditional: "+ (a>b?a-b:b-a));
        System.out.println("conditional: "+ (a>b?"a is big":"b is big"));


    }

}
