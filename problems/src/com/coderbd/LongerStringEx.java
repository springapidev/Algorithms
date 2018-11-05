package com.coderbd;

import java.util.HashSet;

public class LongerStringEx {

    public static void main(String[] args) {
        alternate("beabeefeab");
    }
    // Complete the alternate function below.

    static void alternate(String s) {
        StringBuilder str = new StringBuilder(s);
        int count = 0;
        HashSet<Character> sets = new HashSet<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            sets.add(str.charAt(i));
        }
        for (char ch : sets) {
            System.out.print(ch + " ");
          //  if()
        }
    }

}
