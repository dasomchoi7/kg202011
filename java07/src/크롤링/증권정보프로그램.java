package ũ�Ѹ�;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �����������α׷� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.getContentPane().setForeground(Color.PINK);
		f.setSize(300, 200);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uCE74\uCE74\uC624");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//īī�� ũ�Ѹ��ؼ� ���Ϸ� ����
				���̹��������� ���� = new ���̹���������();
				try {
					����.open("035720");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("����", Font.PLAIN, 20));
		btnNewButton.setBounds(12, 10, 260, 59);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC0BC\uC131\uC804\uC790");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���̹��������� ���� = new ���̹���������();
				try {
					����.open("005930");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 20));
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(12, 79, 260, 59);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);

	}
}
