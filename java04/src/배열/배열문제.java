package �迭;

import javax.swing.JOptionPane;

public class �迭���� {

	public static void main(String[] args) {
		//1. 
//		int[] s = {10, 20, 30, 40, 50};
//		
//		for (int i = 0; i < 1; i++) {
//			System.out.println(s[0]+s[1]);
//		}
		
		//��
		/*int[] n1 = new int[5];
		for (int i = 0; i < n1.length; i++) {
			n1[i] = (i+1) * 10;
			
		} System.out.println(n1[0]+n1[1]);*/
		
		
		//2. 1�����迭���� ������ �ݵ�� ���־�� �Ѵ�!
		//���� ��Ȯ�� �˶��� ����, �� �𸣰ų� �ָ��ϸ� �迭 �Ⱦ�
//		String[] subject = new String[3];
//		
//		for (int i = 0; i < subject.length; i++) {
//			subject[i] = JOptionPane.showInputDialog("���� �Է� >> ");
//		} for (int i = 0; i < subject.length; i++) {
//			System.out.print(subject[i]+ " ");
//		}
//		System.out.println("**JAVA���ٴ� SPRING**");
		
		//��
		/*String[] subject = new String[3];
		
		for (int i = 0; i < subject.length; i++) {
			subject[i] = JOptionPane.showInputDialog("���� �Է� >> ");
		}System.out.println("**" + subject[0]+ "���ٴ�" + subject[1]+ "**");*/
		
		
		//3.
		int[] n3 = {11,22,33,44};
		
		for (int i = 0; i < n3.length; i++) {
			if (n3[i]==33) {
				System.out.println(i);
			}
		}
		
		//4.
		int[] n4 = new int[5];
		//i -> index 
		for (int i = 0; i < n4.length; i++) {
			n4[i] = i+1;
			
		}
		//i -> int
		for (int i : n4) {
			System.out.println(i);
		}
		
		//5.
		
		
		
		
		
	}

}
