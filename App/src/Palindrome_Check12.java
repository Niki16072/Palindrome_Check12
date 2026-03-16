import java.util.Scanner;

public class Palindrome_Check12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string (remove spaces and convert to lowercase)
        input = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is not a Palindrome");
        }
    }
}