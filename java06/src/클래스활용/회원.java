package Ŭ����Ȱ��;

public class ȸ�� {
	
	String id;
	String pw;
	String name;
	String tel;
	
	//�Է°��� ���� Ŭ���� �̸��� ������ �޼��尡 �ڵ����� ��������� �Ǿ�����
	public ȸ��() {
	}
	
	public ȸ��(String x, String y, String z, String t) {
		id = x;
		pw = y;
		name = z;
		tel = t;
	}
	
	@Override
	public String toString() {
		return id + "\t" + pw + "\t" + name + "\t" + tel;
	}
	


}
