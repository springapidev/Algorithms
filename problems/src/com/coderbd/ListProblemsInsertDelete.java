package com.coderbd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListProblemsInsertDelete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        Integer x[] = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
            x[i] = Integer.parseInt(arr[i]);
        }
        List<Integer> list = Arrays.asList(x);

        if (sc.next().equalsIgnoreCase("Insert")) {
            list.add(Integer.parseInt(sc.next()));
        } else if (sc.next().equalsIgnoreCase("Delete")) {
            list.remove(Integer.parseInt(sc.next()));
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
        /*  System.out.println("===========ABC=================");
        List<Integer> abc = new ArrayList();
        abc.add(10);
        abc.add(20);
        abc.add(30);
        abc.remove(0);

        for (int a : abc) {
            System.out.print(a + " ");
        }*/
    }

}
