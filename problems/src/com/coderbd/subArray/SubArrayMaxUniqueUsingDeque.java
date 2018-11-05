package com.coderbd.subArray;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubArrayMaxUniqueUsingDeque {
public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               deque.add(num);
            }
            printSubArrays(deque,m);
            
        }
         static void printSubArrays(Deque d,int m) {
           Object[] arrA=Collections.asLifoQueue(d).toArray();
            
             
        int temp = (int) arrA[0];
        Set<Integer> tempArray = new HashSet<>();
        int maxCount = 0;
        int arrSize = arrA.length;
        int counter = 0;
        for (int startPoint = 0; startPoint < m; startPoint++) {
            for (int grps = startPoint; grps <= arrSize; grps++) {             
                for (int j = startPoint; j < grps; j++) {
                   // System.out.print(arrA[j] + " ");
                    tempArray.add((int)arrA[j]);
                }
        
                temp = tempArray.size();
                tempArray = new HashSet<>();
                if (maxCount < temp) {
                    maxCount = temp;
                }
              //  System.out.println();
            }
        }
        System.out.println(maxCount);
    }
}
