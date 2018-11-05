package com.coderbd;
public class AnagramsProblem {
    
    public static boolean isAnagram(String word, String anagram) {
    if (word.length() != anagram.length()) {
        return false;
    }  
    char[] chars = word.toCharArray();
    //loop through each character in `word`
    for (char c: chars) {
      int index = anagram.indexOf(c);
        //if it exists in `anagram`, remove it using a combination of `substring` calls, else return false
        if (index != -1) {
          anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
        } else {
            return false;
        }
    }
    return anagram.isEmpty();
}
}
