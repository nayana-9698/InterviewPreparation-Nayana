package InterviewPrograms;

public class ExtractNumbers {
    public static void main(String[] args) {
        String input = "abc123def456gh789";

        StringBuilder extractedNumbers = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                extractedNumbers.append(ch);
            }
        }

        System.out.println("Extracted Numbers: " + extractedNumbers.toString());
    }

}
