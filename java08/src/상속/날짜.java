package ���;

import java.util.Date;

public class ��¥ extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("cpu���� ������ ����.");
			}
			Date date = new Date();
			System.out.println(date);
		}
	}
	

}
