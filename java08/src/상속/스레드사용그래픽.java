package ���;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.Date;

public class ��������׷��� extends JFrame{
	JLabel c, i, d; //���������� ����! �۷ι� ����
	
	
	public ��������׷���() {
		getContentPane().setBackground(SystemColor.activeCaption);
		setTitle("���� ������ ���α׷���");
		setSize(1000, 300); //�����ε� : �پ缺, �ϳ��� �̸����� �������� �ҷ���
		
		c = new JLabel("\uCE74\uC6B4\uD130\uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
		c.setFont(new Font("����", Font.BOLD, 20));
		getContentPane().add(c, BorderLayout.NORTH);
		
		i = new JLabel("\uC774\uBBF8\uC9C0 \uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
		i.setFont(new Font("����", Font.PLAIN, 20));
		getContentPane().add(i, BorderLayout.EAST);
		
		d = new JLabel("\uB0A0\uC9DC \uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
		d.setFont(new Font("����", Font.BOLD, 20));
		getContentPane().add(d, BorderLayout.SOUTH);
		
		ī��Ʈ2 cc = new ī��Ʈ2();
		��¥2 dd = new ��¥2();
		�̹���2 im = new �̹���2();
		cc.start();
		dd.start();
		im.start();
		
		setVisible(true);
		}
	
	public static void main(String[] args) {
		��������׷��� name = new ��������׷���();
	}
		
		//����Ŭ����(inner class)
		public class ī��Ʈ2 extends Thread{
			@Override
			public void run() {
				for (int i = 0; i < 6000; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println("cpu���� ������ ����.");
					}
					c.setText("ī���� : "+ i);
				}
			}
			

		}
		public class ��¥2 extends Thread {
			
			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("cpu���� ������ ����.");
					}
					Date date = new Date();
					d.setText(date + "");
				}
			}
			

		}
		public class �̹���2 extends Thread {
			
			@Override
			public void run() {
				for (int j = 0; j < 5; j++) {
					String[] list = {"1.png","2.png","3.png","4.png","5.png"};
					try {
						Thread.sleep(3000); //3�� (1�� - 1000, 0.5��-500)
					} catch (InterruptedException e) {
						System.out.println("cpu���� ������ ����.");
					}
					ImageIcon icon = new ImageIcon(list[j]);
					i.setIcon(icon);
				}
			}
			

		}

		

	

}
