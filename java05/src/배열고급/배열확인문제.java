package �迭���;

import java.util.Random;

public class �迭Ȯ�ι��� {

	public static void main(String[] args) {
		Random r = new Random();
		double[] n = new double[500];
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextDouble();
		}
		double min = n[0];
		for (int i = 0; i < n.length; i++) {
			if (min > n[i]) {
				min = n[i];
			}
		}
		System.out.println("�ּҰ��� "+min);
		
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if(min == n[i]) {
				count++;
			}
		}
		System.out.println(count);
		
		double[] n2 = new double[500];
		for (int i = 0; i < n2.length; i++) {
			n2[i] = r.nextDouble();
		}
		
		int count2 = 0;
		for (int i = 0; i < n2.length; i++) {
			if (n[i]==n2[i]) {
				count2++;
			}
		}
		System.out.println("�� �迭�� ��ġ�� ���� : "+count2+"��");
		
	}

}
