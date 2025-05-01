package InterviewPrograms;

public class ReverseString {
    public static void main(String[] args) {
        // Example input string
        String input = "Hello World!";

        // Using StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();

        // Output the reversed string
        System.out.println("Reversed String: " + reversed.toString());
    }

}
