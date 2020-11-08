package 복습;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의윈도우 {

	public static void main(String[] args) {
		// 자바는 부품조립식 언어(객체 지향언어, OOP)
		// 컨트롤+스페이스바 : 자동완성
		
		JFrame f = new JFrame(); //C드라이브에 있는걸 램에 복사, new 
		JButton b1 = new JButton();
		ImageIcon icon = new ImageIcon("dog.jpeg");
		
		//.을 찍어서 명령어
		f.setSize(300, 300); //가로, 세로값
		b1.setText("강아지");
		
		f.add(b1); 
		
		b1.setIcon(icon);
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true); //보여지는 여부 결정, 맨끝에 위치 해야 입력한게 다 보임.
	

	}

}
