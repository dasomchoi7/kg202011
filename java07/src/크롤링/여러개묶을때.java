package ũ�Ѹ�;

import java.util.ArrayList;

import ����ƽ.����;

public class ������������ {

	public static void main(String[] args) {
		//�迭�� ���� Ÿ�Ը�, ����� ������ ����. ������ ���� �Ұ�.
		//ArrayList�� �ƹ�Ÿ���̳� ������ ���� ����
		ArrayList list = new ArrayList();
		list.add("ȫ�浿");
		list.add(100);
		list.add(11.22);
		list.add(true);
		���� w = new ����("���浿", "��", 100);
		list.add(w);
		System.out.println(list.size());
		System.out.println(list);
		
		
		

	}

}
