package ũ�Ѹ�;

import java.io.FileWriter;
import java.io.IOException;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���̹��������� {

	public void open(String code) throws Exception {
		//public static Connection connect(String url)
		
		Connection con= Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+ code);
		System.out.println("���� ����.");
		Document doc = con.get(); 
		String �ڵ� = doc.select("span.code").get(0).text();
		System.out.println("�ڵ�>> "+ �ڵ�);
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
		String ���� = list.get(0).text();
		String �ð� = list.get(1).text();
		System.out.println("����>> "+ ����);
		System.out.println("�ð�>> "+ �ð�);

		//div.today
		Elements list2 = doc.select("div.today span.blind");
		String ���� = list2.get(0).text();
		System.out.println("����>> "+����);
		
		FileWriter file = new FileWriter(�ڵ�);
		file.write(�ڵ� + "\n");
		file.write(���� + "\n");
		file.write(�ð� + "\n");
		file.write(���� + "\n");
		file.close();
		
		
	}

}
