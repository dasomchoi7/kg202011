package �迭;

import java.util.Scanner;

import javax.swing.JFrame;

public class ��ȭ���Ÿ���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; // �ڵ��ʱ�ȭ {0,0,0,0,~~}
		int count = 0;
		final int PRICE = 10000; //final �����Ұ�, �빮�� ǥ��, ���
		
		while (true) {
			System.out.println("=====================");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			System.out.println("=====================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.print("������ �¼� ��ȣ ���� (����� -1) >> ");
			int no = scan.nextInt();
			if (no == -1) {
				System.out.println("���� �ý����� �����մϴ�.");
				System.out.println("���� �¼� �� : "+ count + "��");
				System.out.println("���� ���� �ݾ�: "+ count*PRICE + "��");
				
				// break; //while ����
				System.exit(0); // ��ǻ�Ϳ��� ���α׷� ����(0 �������µ� ���� �����Ű�����, -1 �����־ ����)
			}

			// no�� 1�� ���!
			if (seat[no - 1] != 1) {
				seat[no - 1] = 1;
				count++;
				System.out.println("���� �Ϸ� �Ǿ����ϴ�.");

			} else {
				System.out.println("���Ű� �̹� �� �ڸ��Դϴ�.");
				System.out.println("�ٸ� �ڸ� ��ȣ�� �������ּ���.");
			}

		}

	}

}
