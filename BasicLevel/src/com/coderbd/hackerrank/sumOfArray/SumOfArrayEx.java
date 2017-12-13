/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.hackerrank.sumOfArray;

import java.util.Scanner;

/**
 *
 * @author Rajail Islam
 */
public class SumOfArrayEx {

    static int simpleArraySum(int n, int[] ar) {
        n = n-n;
        for (int a : ar) {
            n += a;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
