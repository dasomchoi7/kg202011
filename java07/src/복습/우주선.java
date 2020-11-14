package 복습;

public class 우주선 {
	//전역변수
	int x;
	int y;
	String img;
	
	public 우주선(int x, int y, String img) {
		this.x = x;
		this.y = y;
		this.img = img;
	}

	@Override
	public String toString() {
		return "우주선 [x=" + x + ", y=" + y + ", img=" + img + "]";
	}
	
	
	

}
