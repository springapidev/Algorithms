package com.coderbd.math;

import java.math.BigInteger;

/**
 *
 * @author Rajaul Islam
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int np = checkPrimeNumber(1, 100);
        System.out.println("No Of Prime Number: " + np);
    }

    public static int checkPrimeNumber(int startingNum, int endingNum) {
        int numOfprimes = 0;

        startingNum = 0;

        while (true) {
            if (startingNum > endingNum) {
             break;
            }
            if (startingNum > 1) {
                if (new BigInteger(startingNum + "").isProbablePrime(startingNum / 2)) {
                    System.out.println(startingNum);
                    numOfprimes++;
                }
            }
            startingNum++;
        }
        return numOfprimes;
    }

}
