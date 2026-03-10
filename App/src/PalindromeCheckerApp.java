public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "A man a plan a canal Panama";

        // Normalize the string
        // 1. Convert to lowercase
        // 2. Remove spaces and non-alphabet characters
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}