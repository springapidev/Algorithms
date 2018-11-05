package com.coderbd;

public class ThreeNumberCompare {

    public static void main(String[] args) {
        int m = 91;
        int s = 92;
        int a = 92;
        if (m > s && m > a) {
            System.out.println("Motin IS BIG");
        } else if (s > m && s > a) {
            System.out.println("Showkat is BIG");
        } else if (a > m && a > s) {
            System.out.println("Arfin is BIG");
        } else if (m == s && m > a) {
            System.out.println("Motin and Showkat are BIG");
        } else if (m == a && m > s) {
            System.out.println("Arfin and Motin are BIG");
        } else if (s == a && s > m) {
            System.out.println("Arfin and Showkat are BIG");
        } else {
            System.out.println("Motin, Arfin and Showkat is Equal");
        }
    }
}
