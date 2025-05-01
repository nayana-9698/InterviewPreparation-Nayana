package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class UniqueElements {

    public static void main(String[] args) {
        String input = "SSSRJTEH";  // Input string

        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and count character frequencies
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        // Print unique elements (characters that appear only once)
        System.out.println("Unique characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }

}
