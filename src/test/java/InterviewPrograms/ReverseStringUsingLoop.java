package InterviewPrograms;

public class ReverseStringUsingLoop {
    public static void main(String[] args) {
        // Example input string
        String input = "Hello World!";

        // Initialize an empty string to store the reversed string
        String reversed = "";

        // Loop through the input string backwards and build the reversed string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Output the reversed string
        System.out.println("Reversed String: " + reversed);
    }

}
