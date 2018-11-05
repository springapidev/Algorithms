package com.coderbd.subArray;

import java.util.HashSet;
import java.util.Set;

public class SubArrayNegative {

    public void printSubArrays(int[] arrA) {
        int temp = arrA[0];
        Set<Integer> tempArray = new HashSet<>();
        int maxCount = 0;
        int arrSize = arrA.length;
        int counter = 0;
        int sumOfSubArray = 0;
        //start point
        for (int startPoint = 0; startPoint < arrSize; startPoint++) {

            //group sizes
            for (int grps = startPoint; grps <= arrSize; grps++) {
                //if start point = 1 then
                //grp size = 1 , print 1
                //grp size = 2, print 1 2
                //grp size = 3, print 1 2 3 ans so on
                for (int j = startPoint; j < grps; j++) {
                    System.out.print(arrA[j] + " ");
                    tempArray.add(arrA[j]);
                    sumOfSubArray += arrA[j];
                }
                temp = tempArray.size();
                tempArray = new HashSet<>();
                if (sumOfSubArray < 0) {
                    ++maxCount;
                }
                sumOfSubArray = 0;
                System.out.println();
            }
        }
        System.out.println("Max Negative from SubArray: " + maxCount);
    }

    public static void main(String[] args) {
        int[] arrA = {1, -2, 4, -5, 1};
        new SubArrayNegative().printSubArrays(arrA);
    }
}
