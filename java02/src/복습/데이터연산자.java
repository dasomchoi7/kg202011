package ����;

public class �����Ϳ����� {

	public static void main(String[] args) {
		// �⺻ ������ : ����, �Ǽ�, ����, ��
		double �µ� = 25.5; //�Ҽ��� ����° ¥�� 
		float ������ = 99.9F; // �Ҽ��� ��° ¥��, f(��ҹ��� �ƹ��ų�)�ٿ��� �����ؾ���.
		
		//����� ����� �ƴϸ� ������ �ƴ�
		
		byte age = 100; // -128~127
		short distance = 20000; // +-3��
		int high = 100; // +-21��
		long space = 2211111111L; //L(��ҹ��� �����) �ٿ��� ���� �������  
		
		char gender = '��'; //�ѱ��� 
		
		boolean check = true; //or false 
		
		System.out.println(age + distance);
		System.out.println(age == distance);
		System.out.println(age != distance);
		
		// int�� int����� ������ int! 
		int sum = high + 1; //101
		// 1.int sum �����
		// 2.high + 1
		// 3.����
		
		int count = 5;
		
		//�ϳ��� double�̸� ����� ����� ������ double!
		System.out.println(sum/(double)count);
		//���� Ÿ�� ��ȯ (ĳ���� casting) => (�����ϰ��� �ϴ� Ÿ��)������
		
		
		
			
	}

}
