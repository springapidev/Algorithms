/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.strings;

import static com.coderbd.strings.CheckBalanceString.isBalanced;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author User
 */
public class CheckBalancedStringHacker {

  public static void main(String args[]) {
        System.out.println(isBalanced("{}()"));
        System.out.println(isBalanced("(({()}))"));
        System.out.println(isBalanced("}("));
        System.out.println(isBalanced("(({()}))"));
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

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
}
