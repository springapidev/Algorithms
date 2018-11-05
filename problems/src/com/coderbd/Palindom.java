package com.coderbd;

import java.util.Scanner;

public class Palindom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (new StringBuilder(a).reverse().toString().equalsIgnoreCase(a)) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }

}
