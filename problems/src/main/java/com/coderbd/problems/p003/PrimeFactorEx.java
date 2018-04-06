/**
 * Largest prime factor
 * Problem 3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 */
package com.coderbd.problems.p003;

/**
 *
 * @author Rajail Islam
 */
public class PrimeFactorEx {

    public static void main(String[] args) {
      long rs= findPrimeFactor(600851475143L);//29 is from 13195
       
        System.out.println("Result: "+rs);
    }

    public static long findPrimeFactor(long x) {
        long biggest = 0L;
        for (long i = 2L; i <= x; i++) {
            for (long l = 1L; l <= Math.sqrt(i); l++) {
                if (l % i == 0) {
                    break;
                } else {
                    while (x % i == 0) {
                        x = x / i;
                        biggest = i;
                    }
                }
            }
        }
        return biggest;
    }
    
}
