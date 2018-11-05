package com.coderbd.subArray;

import java.util.Scanner;

public class SubArrayNegativeHacker {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //  int[] arrA = {1, -2, 4, -5, 1};
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        int negCount = 0;
        int sumOfSubArray = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = i; k <= arr.length; k++) {
                for (int j = i; j < k; j++) {
                    sumOfSubArray += arr[j];
                }
                if (sumOfSubArray < 0) {
                    ++negCount;
                }
                sumOfSubArray = 0;
            }
        }
        System.out.println(negCount);
    }

}
