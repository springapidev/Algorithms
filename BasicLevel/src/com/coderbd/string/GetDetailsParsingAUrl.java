/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.string;

import java.net.URL;

/**
 *
 * @author Rajail Islam
 */
public class GetDetailsParsingAUrl {

    public static void main(String[] args) throws Exception {
        URL aURL = new URL("http://example.com:80/docs/books/tutorial"
                + "/index.html?name=networking#DOWNLOADING");
        getDetailsParigngaurl(aURL);
    }

    public static void getDetailsParigngaurl(URL aURL) {
        System.out.println("protocol = " + aURL.getProtocol());
        System.out.println("authority = " + aURL.getAuthority());
        System.out.println("host = " + aURL.getHost());
        System.out.println("port = " + aURL.getPort());
        System.out.println("path = " + aURL.getPath());
        System.out.println("query = " + aURL.getQuery());
        System.out.println("filename = " + aURL.getFile());
        System.out.println("ref = " + aURL.getRef());
    }
//https://docs.oracle.com/javase/tutorial/networking/urls/creatingUrls.html
}
