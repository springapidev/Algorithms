package com.coderbd;

import java.io.*;
import java.util.*;

public class CamelcasesEx {

    // Complete the camelcase function below.
    //oneTwoThree
    static int camelcase(String s) {
        int preIndex = 0;
        int counter = 1;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (new Character(s.charAt(i)).isUpperCase(ch)) {
                System.out.println(s.substring(preIndex, i));
                preIndex = i;
                counter++;
            }
        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
}
