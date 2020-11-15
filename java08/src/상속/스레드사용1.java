package 상속;

public class 스레드사용1 {

	public static void main(String[] args) {
		카운트 c = new 카운트();
		날짜 d = new 날짜();
		이미지 im = new 이미지();
		c.start();
		d.start();
		im.start();

	}

}
