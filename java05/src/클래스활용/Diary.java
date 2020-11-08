package 클래스활용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Diary {
	//전역변수
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public void open() {
		//f : 지역변수
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(500, 500);
		f.setTitle("일기써서 파일에 저장하자!!");
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB0A0\uC9DC");
		lblNewLabel.setFont(new Font("궁서체", Font.BOLD, 30));
		lblNewLabel.setBounds(213, 7, 69, 35);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.PINK);
		textField.setFont(new Font("궁서", Font.PLAIN, 20));
		textField.setBounds(74, 40, 344, 47);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" \uC81C\uBAA9");
		lblNewLabel_1.setFont(new Font("궁서", Font.BOLD, 30));
		lblNewLabel_1.setBounds(196, 97, 86, 35);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.PINK);
		textField_1.setFont(new Font("궁서", Font.PLAIN, 20));
		textField_1.setBounds(74, 131, 344, 47);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC624\uB298\uC758 \uB0B4\uC6A9");
		lblNewLabel_2.setFont(new Font("궁서", Font.BOLD, 30));
		lblNewLabel_2.setBounds(145, 188, 187, 40);
		f.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.PINK);
		textField_2.setFont(new Font("궁서", Font.PLAIN, 15));
		textField_2.setBounds(73, 238, 345, 142);
		f.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uD30C\uC77C\uC5D0\uC800\uC7A5.png"));
		btnNewButton_1.setBounds(-12, 390, 496, 60);
		f.getContentPane().add(btnNewButton_1);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1 = textField.getText();
				String data2 = textField_1.getText();
				String data3 = textField_2.getText();
				try {
					FileWriter file = new FileWriter(data1 + ".txt");
					file.write(data1 + "\n");
					file.write(data2 + "\n");
					file.write(data3 + "\n");
					file.close();
					
				} catch (IOException e) {
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);

	}

}
