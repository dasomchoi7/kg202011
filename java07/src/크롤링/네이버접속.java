package ũ�Ѹ�;

import java.io.IOException;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���̹����� {

	public static void main(String[] args) throws Exception {
		//public static Connection connect(String url)
		
		Connection con= Jsoup.connect("http://www.naver.com");
		System.out.println("���� ����.");
		Document doc = con.get(); //�����ҽ��� ��� �ٿ�ε�
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
