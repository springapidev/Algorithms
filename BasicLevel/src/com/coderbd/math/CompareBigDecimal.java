package com.coderbd.math;

import java.math.BigDecimal;

/**
 *
 * @author Rajaul Islam
 */
public class CompareBigDecimal {

    public static void main(String[] args) {

        workingWithBigDecimal(12345, 4);
    }

    public static void workingWithBigDecimal(int base, int scale) {
        BigDecimal number = BigDecimal.valueOf(base, scale);
        System.out.println(number);

        BigDecimal pointRight1 = number.movePointRight(8);
        System.out.println(pointRight1 + "; My Scale is " + pointRight1.scale());

        BigDecimal pointRight2 = number.movePointRight(8);
        System.out.println(pointRight2 + "; My Scale is " + pointRight2.scale());

        BigDecimal scaleBy = number.scaleByPowerOfTen(5);
        System.out.println(scaleBy + "; My scale is " + scaleBy.scale());
    }
}
