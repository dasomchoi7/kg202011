package �迭���;

public class �迭���� {

	public static void main(String[] args) {
		//����
		//�⺻�� : ���� ����
		//������ : �ּҸ� ����

		int a = 100;
		int b = a; //�⺻�� ����
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		
		a = 200;
		System.out.println("������-------");
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		
		System.out.println();
		
		int[] c = {1,2,3};
		int[] d = c;
		System.out.println("c : "+ c);
		for (int x : c) {//c�� x�� �ְ� ó������ ����
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("d : "+ d);
		for (int x : d) {//c�� x�� �ְ� ó������ ����
			System.out.print(x+" ");
		}
		c[0] = 999;
		System.out.println("������-------");
		
		System.out.println("c : "+ c);
		for (int x : c) {//c�� x�� �ְ� ó������ ����
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("d : "+ d);
		for (int x : d) {//c�� x�� �ְ� ó������ ����
			System.out.print(x+" ");
		}

	}

}
