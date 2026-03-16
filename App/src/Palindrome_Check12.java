// UC4: Character Array Based Palindrome Check

public class Palindrome_Check12 {

    public static void main(String[] args) {
        String str = "level"; // Hardcoded input string

        // Convert string to character array
        char[] charArray = str.toCharArray();

        // Use two-pointer approach to check palindrome
        boolean isPalindrome = true;
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}