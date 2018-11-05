package com.coderbd.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnString {

    public static void main(String[] args) {
        String str[] = new String[]{"a", "d", "c", "y", "a"};
        List<String> list = new ArrayList();
        Set<String> sets = new HashSet();

        for (String s : str) {
            list.add(s);
            sets.add(s);
        }

        for (String ss : list) {
            System.out.print(ss + ",");
        }
        System.out.println();
        for (String sss : sets) {
            System.out.print(sss + ",");
        }
        ///////////////////////byte[]//////////
        byte[] bytes = {65, 66, 67, 68, 69, 70};
        String s1 = new String(bytes);
        System.out.println("S1: " + s1);
        String s2 = new String(bytes, 2, 3);
        System.out.println("S2: " + s2);
        /////////////////////////////////
        byte x[] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
        byte y[] = {77, 77, 77, 77, 77, 77, 77, 77, 77, 77};
        System.out.println("x= " + new String(x, 0));
        System.out.println("y= " + new String(y, 0));
        /////////////////////////
        char charArray[] = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");

        // use String constructors
        String s3 = new String();
        String s4 = new String(s);
        String s5 = new String(charArray);
        String s6 = new String(charArray, 6, 3);

        System.out.printf("s3 = %s\ns4 = %s\ns5 = %s\ns6 = %s\n", s3, s4, s5, s6);
        ////////////hashCode()/////////
        System.out.println("Hello".hashCode());
        System.out.println("Hello".hashCode());

    }
}
