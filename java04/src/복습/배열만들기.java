package ����;

public class �迭����� {

	public static void main(String[] args) {
		//�迭�� ���� �� ������ �̹� �˰� �ִ� ��� 
		int[] s = {100, 90, 80, 70};
		//�б� ���� ���� length => �迭 ������ ���� : 4
		//�迭�� ��ġ�� ������ ������ �����ų� �ְų� �Ѵ�.
		//��ġ��(index)�� 0���� ����
		s[0] = 99;
		
		//		 1		     2			3
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]); //4 ->�������  1,2,4,3
		} // i = index
		
		//for-each : �ϳ��� (�ǹ����� ���� ��), �����ϰ� ����ϰų� ���� �� ��.������ ��� ������ �ִµ� ���� ���� ���� 
		for (int x : s) {
			System.out.println(x);	
		}//x=�ӽú���. �ڵ����� 0��°���� �ϳ��� ����.
		
		// �迭�� ���� ��  ������ �𸣰� �ִ� ���
		int[] s2 = new int[4]; //new ������ �ǹ�, RAM�� ������ �����Ѵ�., �ڵ��ʱ�ȭ
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		
		
		
		

	}

}
