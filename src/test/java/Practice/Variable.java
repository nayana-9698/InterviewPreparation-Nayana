package Practice;

public class Variable {

    String instance = "Example for Instance variable";
    public static void main(String[] args) {
        int a=5; int b=10; //local variable
        Variable t = new Variable();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

        System.out.println(t.instance); //instance variable

    }


}
