package Ŭ����Ȱ��;

public class ����2 {
	public void add(int x, int y) {
		//�Է°��� ���� ��ġ�� ��������� x,y���� : �Ű�����(parameter, �Ķ����)
		System.out.println(x+y+"=> ���ϴ�.");
	}
	public void minus(int x, int y, int z) {
		System.out.println(x-y-z+"=> ����.");
	}
	//public : �ƹ������� ���� ����
	//int : ��ȯ(return)�Ǵ� �������� Ÿ��
	//mul(�Է°��� ���� �� �ִ� ������) : �޼����� �̸�
	public int mul(int x, int y) {
		//void : ����. ������ ����. �Ѱ��� ���� ����.
		int result = x * y;
		System.out.println(result + "=> ���ϴ�.");
		return result;
	}

}
