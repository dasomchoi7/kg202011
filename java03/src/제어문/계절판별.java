package ���;

import java.util.Date;

public class �����Ǻ� {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;

		// ctrl+shift+f :�ڵ�������, �ڵ�����

		switch (month) {// break����� ��� �������.
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;	
		default: //if���� else! ��������.
			System.out.println("�ܿ�");
			break;
		}

	}

}
