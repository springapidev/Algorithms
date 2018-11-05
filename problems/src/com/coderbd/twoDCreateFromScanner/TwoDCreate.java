package com.coderbd.twoDCreateFromScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDCreate {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num = sc.nextInt();
        sc.nextLine();
        List<int[]> arrList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String str = sc.nextLine().trim();
            int spaces = str == null ? 0 : str.replaceAll("[^ ]", "").length();
            System.out.println("spaces" + spaces);
            int[] row;
            if (str.length() == 1) {
                row = new int[str.length()];
            } else {
                row = new int[str.length() - spaces];
                System.out.println("size: " + row.length);
            }
            int idx = 0;
            for (int j = 0; j < row.length; j++) {
                row[idx] = sc.nextInt();
                idx++;
            }
            idx = 0;
            arrList.add(row);
        }
        for (int[] oneD : arrList) {
            for (int i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
