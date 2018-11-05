package com.coderbd.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordPolicy {

    public static void main(String[] args) {
        String str = "Abc";
        String regx = "(_)[a-z][A-Z][0-9]";
        Pattern p = Pattern.compile(regx);
        Matcher m = p.matcher(str);
    }
}
