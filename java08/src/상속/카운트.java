package 상속;

public class 카운트 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 6000; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("cpu와의 문제가 생김.");
			}
			System.out.println("카운터 : "+ i);
		}
	}
	

}
