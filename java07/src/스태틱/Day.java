package ����ƽ;

public class Day {
	
	//�ν��Ͻ� ����
	String doing;
	int time;
	String location;
	
	//static ���� 
	static int count; //��������, �ڵ����� 0���� �ʱ�ȭ
	static int sum;
	
	public Day(String doing, int time, String location) {
		super();
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum = sum + time;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	} 
	
	
	
	
	
	

}
