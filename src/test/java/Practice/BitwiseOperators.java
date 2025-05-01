package Practice;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a=5,b=8;
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
