package �迭���;

public class �������� {

	public static void main(String[] args) {
		int[] term1 = {100,80,90}; 
		//������ ������ ���� �ϴ� ��� ���� �����
		//�ּҰ� ����Ű�� ������ �������� �ʴ´�.
		//int[] term2 = term1;//���� ����(��� �ּҸ� ����) 
		
		int[] term2 = term1.clone();//���� ����, �ٸ� ��ġ�� �ٸ� ���� ��������, �迭�� �����Ҷ� ���� �����!
		System.out.println("term1 : "+ term1);
		System.out.println("term2 : "+ term2);
		term2[0] = 99;
		for (int x : term1) {
			System.out.print(x + " ");
		}System.out.println();
		for (int x : term2) {
			System.out.print(x + " ");
		}
		
		
		
		
		
	}

}
