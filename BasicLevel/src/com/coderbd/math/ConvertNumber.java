package com.coderbd.math;

/**
 *
 * @author Rajaul Islam
 */
public class ConvertNumber {

    public static void main(String[] args) {
        int pos = convertNegativeToPositive(-15);
        int neg = convertPositiveToNegative(12);
        System.out.println("Positive from Negative: " + pos);
        System.out.println("Negative from Positive : " + neg);
    }

    public static int convertPositiveToNegative(int positiveNum) {
        int negNum = (~(positiveNum - 1));
        return negNum;
    }

    public static int convertNegativeToPositive(int negativeNum) {
        int positiveNum = ~(negativeNum - 1);
        return positiveNum;
    }
}
