package ������;

import javax.swing.JOptionPane;

public class �⺻�Է�2 {
	// �⺻�Է�1 �̶� ������ �⺻�����Ͱ� �ƴϴϱ� equals ��
	public static void main(String[] args) {
		String id1 = "root"; // ����
		String id2 = JOptionPane.showInputDialog("���̵� �Է��ϼ���"); //���׸� â ������ �Է¹ޱ�

		String pass1 = "abc123"; // ����
		String pass2 = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���"); //���׸� â ������ �Է¹ޱ�
		
		//�������� : and(&&, ������ �� �¾ƾ���), or(||, ������ �Ѱ� �̻� �¾ƾ� ��), not(!, �ƴϴ�)
		if (id1.equals(id2) && pass1.equals(pass2)) { // true
			System.out.println("�հ�!!");
		} else {// false
			System.out.println("���հ�!!");
		}
		// ctrl+shift+f : �ڵ� format. �� ����ϰ� ����. ���� ������ �� ����.

	}

}
