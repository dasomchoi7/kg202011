package Ŭ����Ȱ��;

import Ŭ���������.Tv;

public class TVȰ�� {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.on();
		tv.off();
		tv.shape = "�׸�";
		tv.size = 42;
		System.out.println(tv);
		
		Tv tv2 = new Tv();
		tv2.off();
		tv2.shape = "�׸�";
		tv.size = 55;
		System.out.println(tv2);
		

	}

}
