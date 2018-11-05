package com.coderbd.MarkAndToys;

import java.util.Arrays;

public class MarkAndToysSolutions {

    public static void main(String[] args) {
        int n[] = {1, 12, 5, 111, 200, 1000, 10};
        System.out.println(maximumToys(n, 50));
    }

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int noOfToys = 0;
        Arrays.sort(prices);
        int sum = 0;
        //1 5 10 12 111 200 1000
        for (int i : prices) {
            sum += i;
            if (sum <= k) {
                noOfToys++;

            } else {
                break;
            }
        }

        return noOfToys;
    }
}
