package InterviewPrograms;
import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

    public static void main(String[] args) {
        char[] inputArray = {'a', 'b', 'c', 'a', 'd', 'e', 'b'};

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : inputArray) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
