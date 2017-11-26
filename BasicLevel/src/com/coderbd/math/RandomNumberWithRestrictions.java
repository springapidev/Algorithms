/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.math;

import java.util.Random;

/**
 *
 * @author Rajail Islam
 */
public class RandomNumberWithRestrictions {

    public static void main(String[] args) {
        generateMultipleGrameenPhoneNumber(50000);

    }

    public static void generateMultipleGrameenPhoneNumber(int noOfGpNo) {
        for (int i = 1; i <= noOfGpNo; i++) {
            System.out.println(i + ": " + generateSingleGrameenPhoneNumber());
        }
    }

    /**
     * @see GrameenPhoneNumber is 01721989445
     * @return
     */
    public static String generateSingleGrameenPhoneNumber() {
        Random num = new Random();
        int num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;

        num0 = 0;
        num1 = 1;
        num2 = 7;
        num3 = num.nextInt(9);
        num4 = num.nextInt(10);
        num5 = num.nextInt(10);
        num6 = num.nextInt(10);
        num7 = num.nextInt(10);
        num8 = num.nextInt(10);
        num9 = num.nextInt(10);
        num10 = num.nextInt(10);

        return num0 + "" + num1 + "" + num2 + "" + num3 + "" + num4 + "-" + num5 + num6 + num7 + num8 + num9 + num10;
    }
}
