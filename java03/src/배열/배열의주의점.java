package �迭;

public class �迭�������� {

	public static void main(String[] args) {
		// �迭�� �� ���� ������ ����� ������ ���� �̹� �˰� �ִ��� 
		// �𸣰� �ִ��� üũ�ؾ���.
		// 1.���� �𸣴� ��� : ������ �ϴ� ����� �� ��, ���߿� ���� ����.
		// 2.���� �ƴ� ��� : ������ ����鼭, �ٷ� ���� ����
		
		int[] jumsu = {100, 80, 90, 60, 55};
		jumsu[0]= 90;
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		
		//������ Ű(double), ����(int), �̸�(String,""), ����(char,''), ������ �Ծ�����(boolean) ����Ʈ!
		
		double[] height = {170.8, 180.0, 165.5, 175.0};
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i]);
		}
		int[] age = {35, 40, 25, 20};
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		String[] name = {"������", "��ö��", "�迹��", "�踸��"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		char[] gender = {'��', '��', '��', '��'};
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
		boolean[] food = {true, false, true, false};
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		

	}

}
