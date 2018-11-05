package com.coderbd.prime;

import java.math.BigInteger;

/**
 *
 * @author User
 */
public class PrimeCheck {
    
    public static void main(String[] args) {
        isPrime("54546565646546545");
    }
    
    public static void isPrime(String n) {
        BigInteger num = new BigInteger(n);
        System.out.println("Num: " + num);
        for (int i = 2; i < n.length(); i++) {
           // if(num.divideAndRemainder(new BigInteger(String.valueOf(i)))){
            //    System.out.println(""); 
           //} else {
          //  }
        }
        
    }
}
