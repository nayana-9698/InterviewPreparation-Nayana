package InterviewPrograms;

public class ReverseWords {

    public static void main(String[] args) {
        String input = "I like program language java";

        // Step 1: Split the string into words
        String[] words = input.split(" ");

        // Step 2: Reverse the array of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        // Step 3: Print the result
        System.out.println("Reversed: " + reversed.toString());
    }
}
