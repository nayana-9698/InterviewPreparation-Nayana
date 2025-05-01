package InterviewPrograms;

import java.util.HashMap;

public class CharFrequency {

    public static void main(String[] args) {
        String input = "JavaProgramming";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert to char array and count each character
        for (char c : input.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print the character counts
        for (char c : charCountMap.keySet()) {
            System.out.println(c + ": " + charCountMap.get(c));
        }
    }
}
