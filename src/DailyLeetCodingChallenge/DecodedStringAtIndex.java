package DailyLeetCodingChallenge;

import java.util.Stack;

public class DecodedStringAtIndex {
    public static String decodeAtIndex(String s, int k) {
        Stack<String> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                StringBuilder sb = new StringBuilder();
                while (!stack.empty()) {
                    sb.append(stack.peek());
                    stack.pop();
                }
                for (int j = 1; j < (s.charAt(i) - 48); j++) {
                    stack.push(sb.toString());
                }
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k - 1; i++){
            stack.pop();
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        System.out.println(decodeAtIndex("leet2code3", 10));
    }
}
