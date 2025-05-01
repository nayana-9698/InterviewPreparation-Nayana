package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacter {

    public static void main(String[] args) {
        String input = "hello world";

        input = input.toLowerCase();
        Map<Character, Integer> charCountMap = new HashMap<>();


        for (char ch : input.toCharArray()) {
            if (ch == ' ') continue;
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
