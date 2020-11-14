package 크롤링;

import java.io.FileWriter;
import java.io.IOException;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권접속 {

	public void open(String code) throws Exception {
		//public static Connection connect(String url)
		
		Connection con= Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+ code);
		System.out.println("접속 성공.");
		Document doc = con.get(); 
		String 코드 = doc.select("span.code").get(0).text();
		System.out.println("코드>> "+ 코드);
		Elements list = doc.select("td.first  span.blind");
		//System.out.println(list.size());
		//System.out.println(list);
		//for (int i = 0; i < list.size(); i++) {
		//	System.out.println(list.get(i).text());	
		//}
		
		//td.first
		Elements list1 = doc.select("td.first  span.blind");
		//System.out.println(list.size());
		//System.out.println(list);
		String 전일 = list.get(0).text();
		String 시가 = list.get(1).text();
		System.out.println("전일>> "+ 전일);
		System.out.println("시가>> "+ 시가);

		//div.today
		Elements list2 = doc.select("div.today span.blind");
		String 마감 = list2.get(0).text();
		System.out.println("마감>> "+마감);
		
		FileWriter file = new FileWriter(코드);
		file.write(코드 + "\n");
		file.write(전일 + "\n");
		file.write(시가 + "\n");
		file.write(마감 + "\n");
		file.close();
		
		
	}

}
