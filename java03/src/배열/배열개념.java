package �迭;

public class �迭���� {

	public static void main(String[] args) {
		int s1; //�����Ÿ�� ������; RAM�� ������ �Ҵ�!
		//����! �� �� �ڹٴ� ���� ������ �Ҵ�!
		//����� ��ġ�� �� ������ �� �� �ִ� ��������!
		
		int[] s = new int[10];// 3��
		System.out.println(s);
		System.out.println(s[0]); //ù��° ��ġ��
		//��ġ���� 0���� ����
		
		s[0]=100;
		System.out.println(s[0]);

		//��ġ�� (index, �ε���)�� 0���� ����!!
		//5��°�� 500�� �־ ����Ʈ : ��ġ�� 4 (index)
		s[4]=500;
		System.out.println(s[4]);
		//��������°�� 900�� �־ ����Ʈ :��ġ�� 9
		s[9]=900;
		System.out.println(s[9]);
		
		System.out.println();
		
		//�迭 : int �� 1000���� ����
		//		ù��° 100, 22��° 200, 55��° 300, ��������° 900 �ְ� ����Ʈ
		int[] n = new int[1000];
		n[0]=100;
		n[21]=200;
		n[54]=300;
		
		System.out.println(n[0]);
		System.out.println(n[21]);
		System.out.println(n[54]);
	
		System.out.println(n.length); //�б� ����
		//�迭�� ������ �ڵ����Ǿ� �� �ִ� ����
		System.out.println(s[s.length-1]); //������ ��ġ��
		
		
	}

}
