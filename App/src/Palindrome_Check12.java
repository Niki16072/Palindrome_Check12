// UC2: Print a Hardcoded Palindrome Result

public class Palindrome_Check12 {

    public static void main(String[] args) {
        // Hardcoded string to check
        String str = "madam";

        // Check if the string is a palindrome
        boolean isPalindrome = true;
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print the result
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}