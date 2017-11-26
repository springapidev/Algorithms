package com.coderbd.math;

/**
 *
 * @author Rajaul Islam
 */
public class CalculatePower {
    public static void main(String[] args) {
        int rs=power(3, 3);
        System.out.println("Result "+rs);
    }
        
    public static int power(int baseNum, int powerNum) {
        int result = 1;
        for (int c = 0; c < powerNum; c++) {
            result *= baseNum;
        }
        return result;
    }
}
