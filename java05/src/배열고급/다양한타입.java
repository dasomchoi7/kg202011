package �迭���;

import java.awt.List;
import java.util.ArrayList;

public class �پ���Ÿ�� {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//1.����,�޴���,1000�� ������ ����
		list.add("����");
		list.add("�޴���");
		list.add(1000);
		
		//2.�������� ����Ʈ
		System.out.println(list);
		
		//3.2000���� �߰� ��
		list.add(2000);
		//4.���� ����� ����Ʈ
		System.out.println(list);
		
		//5.������ ����
		list.remove(0);
		System.out.println(list);
		
		//6.���� �����ִ� ���� ����Ʈ
		System.out.println("���� : "+ list.size());
		
	}

}
