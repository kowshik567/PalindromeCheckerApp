public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // 1. Declare and initialize the input string.
        String input = "noon";

        // 2. Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // 3. Push each character of the string into the stack.
        // This stores them such that the last character is on top.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // 4. Assume palindrome initially.
        boolean isPalindrome = true;

        // 5. Iterate again through original string and compare with popped characters.
        // stack.pop() returns the characters in reverse order (LIFO).
        for (char c : input.toCharArray()) {
            char reversedChar = stack.pop();

            if (c != reversedChar) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
        }

        // 6. Display the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}