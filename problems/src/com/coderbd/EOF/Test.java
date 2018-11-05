package com.coderbd.EOF;

import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNext()) {
            System.out.println(i + "" + sc.nextLine());
            i++;
        }
    }

}
