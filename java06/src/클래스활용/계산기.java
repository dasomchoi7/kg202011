package Ŭ����Ȱ��;

public class ���� { 
	
	String color; //����: ��� ����, ��������(�۷ι�����, global)
	
	//��� : ����޼���(=�Լ�, ��ɾ�)
	public void add() {
		int price=0; //����!! ������ ��ġ�� �߿�!!
		//���������� �ڵ��ʱ�ȭ�� �ȵǾ �����Ⱚ�� �� �ִ�.
		//���α׷��Ӱ� �ʱ�ȭ�� �����־�� �Ѵ�.
		System.out.println(price);
		
		//����������  �ڵ� �ʱ�ȭ�� �ȴ�.
		System.out.println(color);
		
		//��������(���ú���, local)
		//�ش� �޼��� ���������� �� �� ����.
		//������ ��ġ�� ����� �� �ִ� ������ �ȴ�.
		System.out.println(color + "�� ����� ���ϴ�.");
	}
	public void mul() {//���ϱ� ��� ó��
		System.out.println(color + "�� ����� ���ϴ�.");
	}
	

}
