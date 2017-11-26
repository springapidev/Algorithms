/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajaul Islam
 */
public class ReadTextFromUrl {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://bdjobs.com/");
        //readTextFromUrl(url);
        try {
            urlReaderWay2(url);
        } catch (IOException ex) {
            Logger.getLogger(ReadTextFromUrl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void readTextFromUrl(URL url) {

        try {
            try ( // read text returned by server
                    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
    
    public static void urlReaderWay2(URL url) throws IOException{
   // URL oracle = new URL("http://www.oracle.com/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
    }


