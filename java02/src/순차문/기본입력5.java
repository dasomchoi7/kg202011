package ������;

import java.util.Scanner;

public class �⺻�Է�5 {

	public static void main(String[] args) {
		//����
				Scanner sc = new Scanner(System.in);
				
				System.out.print("���� �̸���? ");
				String name = sc.next();
				
				System.out.print("���� Ű��? ");
				double height = sc.nextDouble();
				
				System.out.print("���� �����Դ�? ");
				double weight = sc.nextDouble();
				
				System.out.print("���� ������ �Ծ�����? ");
				boolean food = sc.nextBoolean();
				
				//�߰��� ������� ���� enter �ν��ϴ� ���, nextLine()���� ó��!
				sc.nextLine();
				
				System.out.print("���� �¿����? ");
				String life = sc.nextLine();
				
				System.out.println("----------------------------------");
				System.out.println("�� �̸��� "+name);
				System.out.println("�� ���� Ű�� "+(height +10));
				System.out.println("�� ���� �����Դ� "+(weight-5));
				System.out.println("���� ������  "+food);
				System.out.println("���� �¿���� "+life);
				
	}

}
