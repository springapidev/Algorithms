package com.coderbd.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rajail Islam
 */
public class SeparateStringFromAText {

    public static void main(String[] args) {
        String input = "sql-server design database-design datastore";
      
        getWordsFromSentence(input);
    }

    public static String getWordsFromSentence(String str) {
        String words = "";
        Pattern p = Pattern.compile("[\\w']+");
        Matcher m = p.matcher(str);

        while (m.find()) {
    
          words = str.substring(m.start(), m.end())+", ";
           System.out.print(words);
        }
        return words;
    }
}
