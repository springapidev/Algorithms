package com.coderbd.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicatewords {

    public static void main(String[] args) {
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        String str = "Goodbye bye bye world wOrld World";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        while (m.find()) {
            str = str.replaceAll(m.group(), m.group(1));
        }
        System.out.println(str);
    }
}
