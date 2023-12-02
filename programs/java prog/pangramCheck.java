import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangramCheck {
    public static boolean isPangram(String input) {
        // Convert the input to lowercase to ignore case sensitivity
        input = input.toLowerCase();

        Set<Character> letters = new HashSet<>();

        // Iterate through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }

        // Check if all the letters of the alphabet are present
        return letters.size() == 26; // 26 letters in the English alphabet
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            System.out.println("Enter a sentence to check if it's a pangram:");

            if (isPangram(input)) {
                System.out.println("The input is a pangram.");
            } else {
                System.out.println("The input is not a pangram.");

            }
        }
    }
}
