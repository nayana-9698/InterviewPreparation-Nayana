package InterviewPrograms;

public class OverloadMainMethod {


    public static void main(String[] args) {

        System.out.println("Initial main method");
        main(5);
    }

    public static void main(int x) {
        System.out.println("We have overloaded the main method" + x );
    }
}
