package ��Ʈ��ũ;

public class ���� {
	//��������
	String name;
	String field;
	int price;
	
	public void �Ա��ϴ�() {
		System.out.println(name + "�� "+ price +"�� �Ա��ϴ�.");
	}
	public void ����ϴ�() {
		System.out.println(name + "�� " + price + "�� ����ϴ�.");
	}
	//@Override ������ �������. �����Ƕ�� �˷��ִ°�.
	public String toString() {
		return "���� [�̸�=" + name + ", ����=" + field + ", �ݾ�=" + price + "]";
	}
	
	//���� �ִ� �޼��带 �Ȱ��� �ٽ� ���ָ� 
	//�ٽ� ���� �޼��尡 ������ �ȴ�! => ������(override, �������̵�)
	//public String toString() {
	//	return name + ", " + field + ", " + price;
	//}
	
	
	
	
	
	
	
}
