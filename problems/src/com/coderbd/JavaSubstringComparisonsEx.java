package com.coderbd;

public class JavaSubstringComparisonsEx {

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        /*    String str[] = new String[11];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() + 1 - k == i) {
                break;
            }
            str[count] = s.substring(i, i + k);
            ++count;
            //   System.out.print(s.substring(i, i + k) + " ");

        }
       // System.out.println();
      //  java.util.Arrays.sort(str);
       // System.out.println(str[0]);
        // System.out.println(str[str.length - 1]);
         */
        System.out.println("====================");
        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String str[] = new String[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() + 1 - k == i) {
                break;
            }
            str[count] = s.substring(i, i + k);
            ++count;
        }

        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] == null) {
                str = java.util.Arrays.copyOf(str, str.length - 1);
            }
        }
        java.util.Arrays.sort(str);
        smallest = str[0];
        largest = str[str.length - 1];
        return smallest + "\n" + largest;
    }
}
