package 상속;

import java.util.Date;

public class 이미지 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			String[] list = {"1.png","2.png","3.png","4.png","5.png"};
			try {
				Thread.sleep(3000); //3초 (1초 - 1000, 0.5초-500)
			} catch (InterruptedException e) {
				System.out.println("cpu와의 문제가 생김.");
			}
			System.out.println(list[i]);
		}
	}
	

}
