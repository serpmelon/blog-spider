package com.togo.spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @Author taiyn
 * @Description TODO
 * @Date 11:01 上午 2020/4/6
 **/
public class CSDNSpider {

    public void run() {

        try {
            Document document = Jsoup.connect("https://blog.csdn.net/tyn243222791/article/list/1")
                    .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.30 (KHTML, like Gecko) Chrome/12.0.742.122 Safari/534.30")
                    .get();

            Element body = document.body();
            Elements elements = body.select("div[class=article-list]");
            Element artContainer = elements.first();
            Elements artList = artContainer.select("div[class=article-item-box csdn-tracking-statistics]");
            for (Element ele : artList) {

                String title = ele.select("a").first().text();
                String spR = ele.select("span[class=num]").first().text();
                String spD = ele.select("span[class=num]").last().text();
                System.out.println("title " + title + ", 阅读数 " + spR + ", 评论数 " + spD);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
