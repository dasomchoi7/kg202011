package �׷���;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ���Ǳ׷��� {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		for (int i = 0; i < 50; i++) {
			JButton b1 = new JButton();
			b1.setText(i+"�� ���� ������");
			f.add(b1);
			}
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		f.setVisible(true);
	}

}
