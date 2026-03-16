import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Palindrome_Check12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Character> deque = new ArrayDeque<>();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // convert to lowercase and remove spaces
        input = input.toLowerCase().replaceAll("\\s+", "");

        // insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // compare front and rear
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is not a Palindrome");
        }
    }
}
