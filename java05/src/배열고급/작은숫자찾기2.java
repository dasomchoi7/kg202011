package �迭���;

import java.util.Random;

public class ��������ã��2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] n = new int[10000];
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(10000); //0~999,��������
		}
		int max = n[0]; 
		for (int i = 1; i < n.length; i++) {
			if(max < n[i]) {
				max = n[i];
			}
		}
		System.out.println(max);
		//�ִ밪�� ������ ���� ã���� count, ��ġ�� ����Ʈ 
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if (max == n[i]) {
				count++;
				System.out.println("�ִ밪�� ��ġ : "+ i);
			}
		}System.out.println("�ִ밪�� ���� : "+ count+"��");
		

	}

}
