package ����;

import javax.swing.JOptionPane;

public class �迭Ȱ���ϱ�2 {

	public static void main(String[] args) {
		String[] subject = new String[3];
		//{null	, null, null}
		//subject[0], subject[1]~ 
		//JOptionPane.showInputDialog
		//���� �̹� �б⿡ ��� ������ ���� ��ǻ�� ����
		
		for (int i = 0; i < subject.length; i++) {
			subject[i] = JOptionPane.showInputDialog("�����Է�");
		}
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " ");
		}
		
	}

}
