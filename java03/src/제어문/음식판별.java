package ���;

import javax.swing.JOptionPane;

public class �����Ǻ� {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("����� �԰� ���� ������? 1)¥�� 2)�쵿 3)���");
		
		switch (data) {
		case "1":
			System.out.println("�߱������� ����!");
			break;
		case "2":
			System.out.println("�Ͻ������� ����!");
			break;
		case "3":
			System.out.println("�н������� ����!");
			break;
		default:
			System.out.println("������ �Ծ��!");
			break;
			}
		
		
		
	}
}
