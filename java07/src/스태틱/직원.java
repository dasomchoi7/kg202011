package ����ƽ;

public class ���� {
	
	String name;
	String gender;
	int age;
	
	static int count;//0
	static int sum;//0
	
	
	public ����(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum = sum + age;
	}
	
	
	//��� ���ϴ� ����� ���� (�޼���)
	//��ü�������� �ʾƵ� Ŭ���� �̸����� �ٷ� �����ؼ� ����� �� �ִ� �޼���
	//static �޼���
	public static int getAvg() {
		return sum / count;
	}
	
	

	@Override
	public String toString() {
		return "���� [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	

}
