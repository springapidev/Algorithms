package com.coderbd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    public static void main(String[] args) {
        System.out.println(minimumNumber(2, "Z1"));
    }
    // Complete the minimumNumber function below.

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int minNumber = 4;
        int counter = 0;
        int smallLetter = 0;
        int capitalLetter = 0;
        int specialChar = 0;
        int digit = 0;
        if (password.length() < 6) {
            for (int i = 0; i < password.length(); i++) {
                for (int j = 0; j < password.length(); j++) {
                    Character ch = password.charAt(j);
                    Pattern p = Pattern.compile("[!@#$%^&*()-+]", Pattern.CASE_INSENSITIVE);
                    Matcher m = p.matcher(password);
                    //boolean b = m.find();
                    if (Character.isUpperCase(ch)) {
                        capitalLetter = 1;

                    } else if (Character.isLowerCase(ch)) {
                        smallLetter = 1;

                    } else if (Character.isDigit(ch)) {
                        digit = 1;

                    } else if (Character.isSpaceChar(ch) || m.find()) {
                        specialChar = 1;

                    }
                }

            }

            counter = smallLetter + capitalLetter + specialChar + digit;
            if (password.length() == 2 && counter == 2) {
                minNumber = (minNumber - counter)+1;
            }  else {
                minNumber = (minNumber - counter) + 2;
            }
        } else {
            for (int i = 0; i < password.length(); i++) {
                for (int j = 0; j < password.length(); j++) {
                    Character ch = password.charAt(j);
                    Pattern p = Pattern.compile("[!@#$%^&*()-+]", Pattern.CASE_INSENSITIVE);
                    Matcher m = p.matcher(password);
                    //boolean b = m.find();
                    if (Character.isUpperCase(ch)) {
                        capitalLetter = 1;

                    } else if (Character.isLowerCase(ch)) {
                        smallLetter = 1;

                    } else if (Character.isDigit(ch)) {
                        digit = 1;

                    } else if (Character.isSpaceChar(ch) || m.find()) {
                        specialChar = 1;

                    }
                }

            }

            counter = smallLetter + capitalLetter + specialChar + digit;
            minNumber = minNumber - counter;
        }
        return minNumber;
    }

}
