package ����ƽ;

public class �̻��� {
	//��ü ������ �ڵ����� ����Ǵ� ������(dynamic����)
	//������ ���� ����(instance ����)
	String name;
	int move;
	static int count; //static ���� ����! ���� �ȵ�. �����Ǵ� �뵵.
	
	public �̻���(String name, int move) {
		this.name = name;
		this.move = move;
		count++;
	}

	@Override
	public String toString() {
		return "�̻��� [name=" + name + ", move=" + move + "]";
	}
	
	

}
