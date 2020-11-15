package 상속;

public class 베이비 extends 사람{
	
	int kg;
	int cm;
	
	public void	move() {
		System.out.println("아기가 기어다니다.");
	}

	@Override
	public String toString() {
		return "베이비 [kg=" + kg + ", cm=" + cm + "]";
	}
	
	


}
