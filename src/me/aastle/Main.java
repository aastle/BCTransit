package me.aastle;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Main {
    final static String url = "http://www.ridebctransit.com/transit/35-outbound-weekday";
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect(url).get();
            for(Element element : document.select("table tr")){
                System.out.println(element.text());
            }
            for(Element element : document.getElementById("center").select("p")){
              System.out.println(element.text());
            }
        }catch (IOException io){
            System.out.println(io.fillInStackTrace());
        }
    }
}
