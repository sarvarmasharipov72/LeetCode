package Strings;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{' -> {
                    stack.add('{');
                    break;
                }
                case '(' -> {
                    stack.add('(');
                    break;
                }
                case '[' -> {
                    stack.add('[');
                    break;
                }
                case '}' -> {
                    if (stack.empty() || stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                        break;
                    }
                }
                case ')' -> {
                    if (stack.empty() || stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                        break;
                    }
                }
                case ']' -> {
                    if (stack.empty() || stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                        break;
                    }
                }
            }
        }
        return stack.size() == 0;
    }
}
