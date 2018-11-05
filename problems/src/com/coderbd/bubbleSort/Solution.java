package com.coderbd.bubbleSort;

public class Solution {

    public static void main(String[] args) {
        int[] n = {3, 2, 1};
        countSwaps(n);
    }

    static void countSwaps(int[] a) {
        int noOfSwaps = 0;
        boolean needNextPass = true;
        for (int i = 1; i < a.length && needNextPass; i++) {
            // Array May be sorted and then no need next pass, so
            needNextPass = false;
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    needNextPass = true;
                    noOfSwaps++;
                }
            }

        }
        System.out.println("Array is sorted in " + noOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
