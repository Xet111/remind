package Jav8.String;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class UkrNetAPI {
    private final static String UKR_NET_LINK = "https://yandex.ua/";
    public void showFeed() throws Exception {
        Document ukrNet = Jsoup.connect(UKR_NET_LINK)
                .userAgent("Chrome/4.0.249.0 Safari/532.5")
                .referrer("http://www.google.com")
                .get();
        String title = ukrNet.title();
        Elements listCurrency = ukrNet.select(
                "div#news_panel_news.news__panel.mex-tabber-slide2__panel");
        System.out.println(listCurrency);

        for(Element element : listCurrency.select("a"))
            System.out.println(element.text());
        System.out.println(title);
    }

}
