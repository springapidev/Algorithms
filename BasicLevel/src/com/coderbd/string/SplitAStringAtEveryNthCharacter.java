package com.coderbd.string;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rajaul Islam
 */
public class SplitAStringAtEveryNthCharacter {

    public static void main(String[] args) {
        List<String> list = getPartsFromBigString("HelloWorldJava", 5);
        list.forEach((s) -> {
            System.out.println(s);
        });
    }

    private static List<String> getPartsFromBigString(String string, int partitionSize) {
        List<String> parts = new ArrayList<>();
        int length = string.length();
        for (int i = 0; i < length; i += partitionSize) {
            parts.add(string.substring(i, Math.min(length, i + partitionSize)));
        }
        return parts;
    }
}
