package me.aastle;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Main {
    final static String url = "http://www.ridebctransit.com/transit/35-outbound-weekday";
    public static void main(String[] args) {
        try {
            System.out.println("<!DOCTYPE html>");
            System.out.println("<html lang=\"en\">");
            System.out.println("<head>");
            System.out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
            System.out.println("</head>");
            System.out.println("<body>");

            Document document = Jsoup.connect(url).get();
            for(Element element : document.select("table")){
                System.out.println(element.toString() + element.text());
            }
            for(Element element : document.getElementById("center").select("p")){
              System.out.println(element.toString() + element.text());
            }
            System.out.println("</body>");
            System.out.println("</html>");

        }catch (IOException io){
            System.out.println(io.fillInStackTrace());
        }
    }
}
