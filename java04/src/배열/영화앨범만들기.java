package �迭;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ��ȭ�ٹ������ {

	static int count = 2; //���� ��ġ �˷��ִ� ����
	
	public static void main(String[] args) {
		String[] title = {"�����׷� �������͹�", "�㺸", "���÷���", "�̽���Ʈ�� : �� ����", "�Ҹ�������"};
		String[] list = {"1.png","2.png","3.png","4.png","5.png"};
		double[] jumsu = {9.27, 9.18, 8.87, 8.93, 7.89};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		
		JLabel top = new JLabel(title[2]);
		top.setFont(new Font("����", Font.PLAIN, 17));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		f.getContentPane().add(center, BorderLayout.CENTER);
		ImageIcon icon = new ImageIcon(list[2]);
		center.setIcon(icon);
		
		JLabel sub = new JLabel(jumsu[2] + "��");
		sub.setFont(new Font("����", Font.PLAIN, 15));
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count > 0) {
					count--; // 2->1
					top.setText(title[count]);
					sub.setText(jumsu[count]+ "��");
					ImageIcon icon = new ImageIcon(list[count]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "���� �������Դϴ�.");
				}
				
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("����", Font.PLAIN, 42));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 42));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (count < 4) {
					count++;
					top.setText(title[count]);
					sub.setText(jumsu[count]+ "��");
					ImageIcon icon = new ImageIcon(list[count]);
					center.setIcon(icon);
					
				} else {
					JOptionPane.showMessageDialog(f, "������ �������Դϴ�.");
				}
				
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		
		
		
		
		
		
		
		
		
		
		//�� ���� �־�� �Ѵ�!
		f.setVisible(true);
		
	}

}
