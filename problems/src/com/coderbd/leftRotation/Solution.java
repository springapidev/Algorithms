package com.coderbd.leftRotation;

public class Solution {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i : leftRotate(arr, 5)) {
            System.out.println(i + " ");
        }
    }

    public static int[] leftRotate(int[] a, int d) {
        int[] arr1 = new int[d];
        int[] arr2 = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (i < d) {
                arr1[i] = a[i];
            } else {
                arr2[j] = a[i];
                j++;
            }
        }
        System.arraycopy(arr1, 0, arr2, a.length - d, d);
        return arr2;
    }

}
