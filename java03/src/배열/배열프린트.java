package �迭;

public class �迭����Ʈ {

	public static void main(String[] args) {
		/*int t = 0; //�����Ⱚ ������ ������ ���� ����Ʈx, ����x (int t;) ó������ �־��־�� ��.
		//ó�� ���� �־��ִ� ��-���� �ʱ�ȭ!
		System.out.println(t);*/

		int[] s = new int[100];//0���� �ڵ� �ʱ�ȭ!
		s[0] = 100;
		s[s.length-1] = 900;
		//�迭�� �ڵ� �ʱ�ȭ!
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		System.out.println("================");
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(i+ ": "+ s[i]);
		}
		
		
		
		
	}

}
