package InterviewPrograms;

public class CharacterAnalysis {
    public static void main(String[] args) {
        String input = "N165$J SFD";

        StringBuilder alphabets = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        int totalCharacters = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isAlphabetic(ch)) {
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }

            totalCharacters++;
        }

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Numbers: " + numbers);
        System.out.println("Total characters: " + totalCharacters);


        //Try with Regex


    }
}
