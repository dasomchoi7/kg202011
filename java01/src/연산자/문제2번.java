package 연산자;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;


public class 문제2번 {

	public static void main(String[] args) {
		// 자주 안쓰는 부품
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton b = new JButton();
		b.setText("나를 눌러요!!!");
		
		f.add(b);
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		
		//자동 import : ctrl+shift+o(영문)
		Font font = new Font("궁서", 1, 50);
		b.setFont(font);
		
	
		f.setVisible(true);

	}

}
