package ���;

import java.util.Date;

public class ��¥���� {

	public static void main(String[] args) {
		Date date = new Date(); //�ѹ����� ��� ���� ����
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour+"�� "+ min + "�� "+ sec +"��" );
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int today = date.getDate();
		System.out.println(year + "�� "+ month+ "�� "+ today+ "��" );
		
		int day = date.getDay(); //����
		System.out.println(day);
		
		if (day==0) {
			System.out.println("�Ͽ���");
		} else if (day==1) {
			System.out.println("������");

		}else if (day==2) {
			System.out.println("ȭ����");

		}else if (day==3) {
			System.out.println("������");

		}else if (day==4) {
			System.out.println("�����");
			
		}else if (day==5) {
			System.out.println("�ݿ���");
		}else if (day==6) {
			System.out.println("�����");
		}
		
		//if-else if- else ���� �ڵ�. if���� ���� cpu�� ��� üũ�ؼ� �� ����. 
		//else if�� ������ ������ �Ʒ��� �� �̻� �����Ű�� �ʰ�, if�� break �ɷ��� ����!
		//else�� �� �Ƚᵵ �ȴ�
		
		
	}

}
