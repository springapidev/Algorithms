/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.strings.comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author User
 */
public class Checker2 {

   
    static void sort(Player[] players, Checker2 checker) {
        Arrays.sort(players, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (((Player) o1).score == ((Player) o2).score) {
                    return ((Player) o1).name.compareTo(((Player) o2).name);
                } else {
                    return ((Player) o2).score - ((Player) o1).score;
                }
            }
        });
    }
}
