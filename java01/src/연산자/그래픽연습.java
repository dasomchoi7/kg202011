package ������;

import javax.swing.JOptionPane;

public class �׷��ȿ��� {

	public static void main(String[] args) {
//		String name = JOptionPane.showInputDialog("�̸��� �Է�"); //ȫ�浿
//		System.out.println(name);
//		//int age = 100;
//		//�ܺο��� �Է��ؼ� ������ �־��ִ� ���� 
//		//��ǻ�ʹ� ������ String ó����!
//		String age = JOptionPane.showInputDialog("���̸� �Է�");
//		int age2 = Integer.parseInt(age);
//		
//		System.out.println(age2+1+"��");

		//���� 1 �Է�
		//���� 2 �Է�
		//�� ���� ���� ~~
		//�� ���� ���� ~~
		//�� ���� ���� ~~
		//�� ���� ��������~~
		
		String n1 =JOptionPane.showInputDialog("����1 �Է�");
		String n3=JOptionPane.showInputDialog("����2 �Է�");
		int n2 =Integer.parseInt(n1);
		int n4 = Integer.parseInt(n3);
		
		System.out.println(n2+n4);
		System.out.println(n2-n4);
		System.out.println(n2*n4);
		System.out.println(n2/n4);
		
		//null, ���ٶ�� �ǹ�, ��
		JOptionPane.showMessageDialog(null, n2+n4);
	}

}
