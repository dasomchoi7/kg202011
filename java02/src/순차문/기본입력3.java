package ������;

import javax.swing.JOptionPane;

public class �⺻�Է�3 {
	public static void main(String[] args) {
	
	//��� �Է��� Ÿ���� ������ String���� ��ǻ�ʹ� ó���Ѵ�!
	String n1 = JOptionPane.showInputDialog("����1 �Է�"); 
	String n2 = JOptionPane.showInputDialog("����2 �Է�"); 

	System.out.println(n1 + n2); //1�� �̻� String�̸� +�� ���տ����ڰ� �� 
	
	int n11 = Integer.parseInt(n1);
	int n22 = Integer.parseInt(n2);
	System.out.println(n11 + n22); //���������
	
	
	
	}

}
