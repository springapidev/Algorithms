package com.coderbd.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1Az {

    public static void main(String[] args) {
        String regex = "\\w+";
        Pattern pattern = Pattern.compile(regex);

        String candidate = "asdf abc Java2s.com";

        Matcher matcher = pattern.matcher(candidate);

        if (matcher.find()) {
            System.out.println("GROUP 0:" + matcher.group(0));
        }

    }
}
