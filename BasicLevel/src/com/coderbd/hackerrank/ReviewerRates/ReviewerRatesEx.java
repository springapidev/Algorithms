/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.hackerrank.ReviewerRates;

import java.util.Scanner;

/**
 *
 * @author Rajail Islam
 */
public class ReviewerRatesEx {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        // Complete this function
        int[] results = new int[6];
        if (a0 > b0) {
            results[0] = 1;
        }
        if (a0 < b0) {
            results[3] = 1;
        } else {
        }
        if (a1 > b1) {
            results[1] = 1;
        }
        if (a1 < b1) {
            results[4] = 1;
        } else {

        }
        if (a2 > b2) {
            results[2] = 1;
        }
        if (a2 < b2) {
            results[5] = 1;
        } else {

        }
        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);

        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }

        }
        System.out.println("");

    }
}
/*

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from to for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .

Your task is to find their comparison points by comparing with , with , and with .

    If , then Alice is awarded point.
    If , then Bob is awarded point.
    If , then neither person receives a point.

Comparison points is the total points a person earned.

Given and , can you compare the two challenges and print their respective comparison points?

Input Format

The first line contains space-separated integers, , , and , describing the respective values in triplet .
The second line contains space-separated integers, , , and , describing the respective values in triplet .
 */
