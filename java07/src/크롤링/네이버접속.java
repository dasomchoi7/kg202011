package 크롤링;

import java.io.IOException;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버접속 {

	public static void main(String[] args) throws Exception {
		//public static Connection connect(String url)
		
		Connection con= Jsoup.connect("http://www.naver.com");
		System.out.println("접속 성공.");
		Document doc = con.get(); //문서소스를 모두 다운로드
		//System.out.println(doc);
		System.out.println(doc.select("a.nav").size());
//		for (int i = 0; i < 16; i++) {
//			System.out.println(doc.select("a.nav").get(i).text());
//		}
		Elements list = doc.select("a.nav");
		System.out.println(list.size());
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).text());	
		}

	}

}
