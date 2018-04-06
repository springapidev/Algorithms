/**
 * Problem 1: If we list all the natural numbers below 10 that are multiples
 * of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find
 * the sum of all the multiples of 3 or 5 below 1000.
 */
package com.coderbd.problems.p001;

/**
 *
 * @author Rajail Islam
 */
public class SumEx {

    public static void main(String[] args) {
        int rs = calSum(1, 1000);
        System.out.println("Result: " + rs);
    }

    public static int calSum(int startNumber, int endNumber) {
        int sum = 0;
        for (startNumber = 1; startNumber < endNumber; startNumber++) {
            if ((startNumber % 3) == 0 || (startNumber % 5) == 0) {
                sum += startNumber;
            }
        }
        return sum;
    }
}
