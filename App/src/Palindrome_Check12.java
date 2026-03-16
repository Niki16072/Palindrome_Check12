import java.util.Scanner;

public class Palindrome_Check12 {

    // Recursive method
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters are not equal
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = checkPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}