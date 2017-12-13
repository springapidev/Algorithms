/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.jumpSearch;

/**
 *
 * @author Rajail Islam
 */
public class JumpSearch {

    // Driver program to test function
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21,
            34, 55, 89, 144, 233, 377, 610};
        int x = 55;

        // Find the index of 'x' using Jump Search
        int index = runJumpSearch(arr, x);

        // Print the index where 'x' is located
        System.out.println("\nNumber " + x
                + " is at index " + index);
    }

    public static int runJumpSearch(int[] arr, int x) {
        int n = arr.length;

        // Finding block size to be jumped
        int step = (int) Math.floor(Math.sqrt(n));

        // Finding the block where element is
        // present (if it is present)
        int prev = 0;
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        // Doing a linear search for x in block
        // beginning with prev.
        while (arr[prev] < x) {
            prev++;

            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        // If element is found
        if (arr[prev] == x) {
            return prev;
        }

        return -1;
    }
}
