package �迭;

import java.util.Random;

public class ����ä�� {

	public static void main(String[] args) {
		int[] ���� = new int[990];
		int[] ���� = new int[990];
		
		Random r = new Random(42); 
		//()�ȿ� ���ڸ� ������ : ���Ѱ�, seed�� / �� ������ ��� �������� ���ڰ� ����.
		
		for (int i = 0; i < ����.length; i++) {
			 ����[i] = r.nextInt(4)+1; //0~3=> 1�� �����༭ 1~4
		}
		for (int i = 0; i < ����.length; i++) {
			 ����[i] = r.nextInt(4)+1; //0~3=> 1�� �����༭ 1~4
		}
		int jumsu=0;
		for (int i = 0; i < ����.length; i++) {
			System.out.println(i + 1 + ": "+ ����[i] + " <-> "+ ����[i]);
			if (����[i]== ����[i]) {
				jumsu++;
			}
			
		} System.out.println("������ "+ jumsu +"��");

	}

}
