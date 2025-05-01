package InterviewPrograms;

public class StringCompressor {

    public static void main(String[] args) {
        // Example input string
        String input = "aaabbbcccd";

        // Compress the string
        String compressed = compressString(input);

        // Output the result
        System.out.println("Compressed String: " + compressed);
    }

    // Method to compress the string
    public static String compressString(String input) {
        // If input is empty or contains a single character, return it as is
        if (input == null || input.length() == 0) {
            return input;
        }

        // Initialize an empty StringBuilder to store the compressed string
        StringBuilder compressed = new StringBuilder();

        // Initialize a counter for consecutive characters
        int count = 1;

        // Loop through the string starting from the second character
        for (int i = 1; i < input.length(); i++) {
            // If the current character is the same as the previous, increment the count
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                // Otherwise, append the previous character and its count to the compressed string
                compressed.append(input.charAt(i - 1));
                compressed.append(count);
                count = 1; // Reset the count for the new character
            }
        }

        // Append the last character and its count
        compressed.append(input.charAt(input.length() - 1));
        compressed.append(count);

        // Convert StringBuilder to String and return
        return compressed.toString();
    }

}
