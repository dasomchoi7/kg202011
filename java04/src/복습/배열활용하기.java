package ����;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class �迭Ȱ���ϱ� {

	public static void main(String[] args) {
		int[] s = new int[5]; //{0,0,0,0,0}
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < s.length; i++) {
			System.out.print("���� �Է�>> ");
			s[i]=scan.nextInt();
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		

		
	}

}
