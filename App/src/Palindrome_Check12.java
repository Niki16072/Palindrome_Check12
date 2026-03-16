import java.util.Stack;

public class Palindrome_Check12 {

    public static void main(String[] args) {
        String str = "madam"; // Hardcoded input string
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string into the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Build reversed string by popping from the stack
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Check if the original string is a palindrome
        if (str.equals(reversed.toString())) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}