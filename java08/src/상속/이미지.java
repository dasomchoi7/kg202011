package ���;

import java.util.Date;

public class �̹��� extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			String[] list = {"1.png","2.png","3.png","4.png","5.png"};
			try {
				Thread.sleep(3000); //3�� (1�� - 1000, 0.5��-500)
			} catch (InterruptedException e) {
				System.out.println("cpu���� ������ ����.");
			}
			System.out.println(list[i]);
		}
	}
	

}
