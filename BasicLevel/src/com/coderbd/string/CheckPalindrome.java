package com.coderbd.string;

/**
 *
 * @author Rajaul Islam
 */
public class CheckPalindrome {

    public static void main(String[] args) {
        String[] words = wordsSplitFromSentence("I am in second level hey apa how are you?, madam wow picture is great");

        boolean status = false;
         System.out.print("Palimdrome are: ");
        for (String s : words) {
            status = checkPalindrome(s);
            if (status == true) {
               
                System.out.print(s+", ");
            }
        }

    }

    public static String[] wordsSplitFromSentence(String sentence) {
        String[] words = sentence.split(" ");
        return words;
    }

    public static boolean checkPalindrome(String str) {
        boolean status = true;
        int f = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(f - i)) {
                status = false;
            }
        }
        return status;
    }
}
