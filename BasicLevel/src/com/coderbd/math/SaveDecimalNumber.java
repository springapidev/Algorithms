package com.coderbd.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Rajaul Islam
 */
public class SaveDecimalNumber {

    public static void main(String[] args) {
        double rs = getDecimalNumber(820.0, 1440.0);
        System.out.println("Result: " + rs);
    }

    public static double getDecimalNumber(double num1, double num2) {
        double operation = num1 / num2;
        BigDecimal big = new BigDecimal(operation);
        big = big.setScale(2, RoundingMode.HALF_UP);
        double d2 = big.doubleValue();
        System.out.println(String.format("operation : %s", operation));
        System.out.println(String.format("scaled : %s", d2));

        return d2;
    }
}
