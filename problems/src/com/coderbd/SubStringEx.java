package com.coderbd;

import java.util.Scanner;

public class SubStringEx {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String rs = s.substring(start, end);
        System.out.println(rs);
    }
}
