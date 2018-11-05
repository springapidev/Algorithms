package com.coderbd;

import java.util.Scanner;

public class StringExtractOddEven {
 private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
       int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int j = 0; j < n; j++) {
            String oddStr = "";
           String evenStr = "";
           String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
         
            if (i % 2 != 0) {
                oddStr += s.charAt(i);
            } else {
                evenStr += s.charAt(i);
            }

        }
        System.out.println(evenStr + " " + oddStr);
            
        }
}

}
