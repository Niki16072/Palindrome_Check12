// UC3: Palindrome Check Using String Reverse

public class Palindrome_Check12 {

    public static void main(String[] args) {
        String original = "radar"; // Hardcoded input string
        String reversed = "";

        // Reverse the string using a loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Check if the original string is a palindrome
        if (original.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
    }
}