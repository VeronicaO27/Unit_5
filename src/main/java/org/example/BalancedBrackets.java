package org.example;
import java.util.Stack;

public class BalancedBrackets {
    public boolean isBalancedParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}

// runtime is O(n) because we use a loop to iterate through each character in the string of brackets.
// Space is O(n) because a new stack is created to store the data.
// The solution provided uses a counter to keep track of the number of closing brackets and opening brackets. whereas I use pop and peek to check for the brackets.
//If I used a queue itwould change because I would constantly be just checking for what is right in front of me and keeping track of the pairs with a counter