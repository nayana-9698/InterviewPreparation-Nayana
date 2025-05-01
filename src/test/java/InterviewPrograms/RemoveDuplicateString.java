package InterviewPrograms;

import java.util.HashSet;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        // Example input string array with duplicates
        String[] input = {"apple", "banana", "apple", "orange", "banana", "grape"};

        // Using a HashSet to automatically handle duplicates
        HashSet<String> uniqueStrings = new HashSet<>();

        // Adding strings to the HashSet (duplicates will be removed automatically)
        for (String str : input) {
            uniqueStrings.add(str);
        }

        // Convert the HashSet back to an array or print directly
        System.out.println("Strings after removing duplicates:");
        for (String str : uniqueStrings) {
            System.out.println(str);
        }
    }

}
