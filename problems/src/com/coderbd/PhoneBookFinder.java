package com.coderbd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookFinder {

    public static void main(String[] argh) {
        String result = "";
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);

        }
        String key = "";
        Integer ph = 0;
        while (in.hasNext()) {
            String s = in.next();
            // Write code here

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (s.equalsIgnoreCase(entry.getKey())) {
                    key = entry.getKey();
                    ph = entry.getValue();
                    
                    break;
                }
            }
           
        }
         result += key + "=" + ph;
            if (result == "") {
                result += "Not found";
                System.out.println(result);
            } else {
                result += key + "=" + ph;
                System.out.println(result);
            }

        in.close();
    }
}
