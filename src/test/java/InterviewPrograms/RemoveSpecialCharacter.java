package InterviewPrograms;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        // Example input string
        String input = "A#b%₹#!&%cdef";

        // Replace all non-alphanumeric characters with an empty string
        String result = input.replaceAll("[^a-zA-Z0-9]", "");

        // Output the result
        System.out.println("String after removing special characters: " + result);
    }

}
