package �迭���;

public class ����Ȯ�ι��� {

	public static void main(String[] args) {
		//1. ���� 100, ���� ���к��� 10�� �� ���� ������ ����Ʈ�ؼ� Ȯ�� 
		int[] su = {100};
		int[] eng = su.clone();
		//System.out.println("su : "+ su);
		//System.out.println("eng : "+ eng);
		eng[0]=90;
		for (int x : su) {
			System.out.print(x + " ");
		}System.out.println();
		for (int x : eng) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//2. int[] ����������� {100,99,88}; ���������� ���������� �ι�° ������ 77������ ������
		// �� ������ ���� ��� ����Ʈ �ؼ� Ȯ��.
		int[] su1 = {100,99,88}; 
		int[] eng1 = su1.clone();
		eng1[1] = 77;
		for (int x : su1) {
			System.out.print(x + " ");
		}System.out.println();
		for (int x : eng1) {
			System.out.print(x + " ");
		}System.out.println();
		
		
		
	}

}
