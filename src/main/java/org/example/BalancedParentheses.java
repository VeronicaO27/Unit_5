package org.example;
import java.util.Stack;


public class BalancedParentheses {
    public boolean isBalancedParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if(c == '(')
                stack.push(')');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}

// runtime is O(n) because we use a loop to iterate through each character in the string of brackets.
// Space is O(n) because a new stack is created to store the data.