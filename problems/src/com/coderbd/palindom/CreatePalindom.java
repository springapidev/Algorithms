package com.coderbd.palindom;

public class CreatePalindom {

    public static void main(String[] args) {
        createPalindom("yee");
    }

    public static void createPalindom(String s) {
        String palindom = null;
        StringBuilder str = new StringBuilder(s);
        int len = str.length();
        System.out.println("numOfChars" + len + " :: " + str);
        int oddChars = 0;

        String firstHalf = null;
        String secondHalf = null;
        for (int i = 0; i < len; i++) {
            if (i % 2 != 0) {
                oddChars++;
            }
        }
        if (oddChars > 1 || oddChars == 1 && len % 2 == 0) {
            System.out.println("NO PALINDROME is possible");
        } else {
            firstHalf += s.substring(0, Integer.parseInt(String.valueOf(Math.floor(len / 2))));
            secondHalf += s.substring(Integer.parseInt(String.valueOf(Math.floor(len / 2))), len - 1);
            palindom = secondHalf + s.charAt(Integer.parseInt(String.valueOf(Math.floor(len / 2))) + len % 2) + firstHalf;
        }
        System.out.println(firstHalf.charAt(Integer.parseInt(String.valueOf(Math.floor(len / 2))) + len % 2));
        System.out.println("palindom: " + palindom);
    }
}
/*

Rearrange characters to form palindrome if possible

Given a string, convert the string to palindrome without any modifications like adding a character, removing a character, replacing a character etc.
Examples:

Input : "mdaam"
Output : "madam" or "amdma"

Input : "abb"
Output : "bab"

Input : "geeksforgeeks"
Output : "No Palindrome"

 */
 /*
1. Count occurrences of all characters.
2. Count odd occurrences. If this count is greater than 1 or is equal to 1 and length of the string is even then obviously palindrome cannot be formed from the given string.
3. Initialize two empty strings firstHalf and secondHalf.
4. Traverse the map. For every character with count as count, attach count/2 characters to end of firstHalf and beginning of secondHalf.
5. Finally return the result by appending firstHalf and secondHalf
 */
