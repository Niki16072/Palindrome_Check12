import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome_Check12 {

    public static void main(String[] args) {
        String str = "radar"; // Hardcoded input string

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue characters and push into stack
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.offer(ch);     // Enqueue
            stack.push(ch);      // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue (FIFO) vs pop (LIFO)
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char queueChar = queue.poll();    // Dequeue
            char stackChar = stack.pop();     // Pop

            if (queueChar != stackChar) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}