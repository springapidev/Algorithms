package com.coderbd.strings;

import java.util.Stack;

public class CheckBalanceString {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        System.out.println(isBalanced("{}()"));
        System.out.println(isBalanced("(({()}))"));
        System.out.println(isBalanced("}("));
        System.out.println(isBalanced("(({()}))"));
    }
}
