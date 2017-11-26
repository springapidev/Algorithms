/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.ex1;

import java.io.IOException;
import static java.rmi.server.LogStream.log;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Rajail Islam
 */
public class ReadUrl {
//All credits goes to https://jsoup.org/
    
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
        log(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");
        newsHeadlines.forEach((headline) -> {
            log("%s\n\t%s" + headline.attr("title") + headline.absUrl("href"));
            System.out.println( headline.attr("title") + headline.absUrl("href"));
        });
    }
}
