package ±×·¡ÇÈ;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;

public class ³ªÀÇ±×·¡ÇÈ2 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uB20C\uB7EC\uC694!");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 42));
		btnNewButton.setBounds(201, 91, 212, 76);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB20C\uB7EC\uC6A9");
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnNewButton_1.setBounds(90, 196, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC138\uBC88\uC9F8");
		rdbtnNewRadioButton.setBackground(Color.BLUE);
		rdbtnNewRadioButton.setForeground(Color.ORANGE);
		rdbtnNewRadioButton.setFont(new Font("±Ã¼­Ã¼", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(181, 316, 121, 23);
		f.getContentPane().add(rdbtnNewRadioButton);
	
		
		f.setVisible(true);
	}
}
