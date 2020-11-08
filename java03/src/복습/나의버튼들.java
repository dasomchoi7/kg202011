package 복습;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 나의버튼들 {
	private static JTextField text;
	
	private static int count = 0;

	public static void main(String[] args) {
		
		Random r = new Random();
		int target = r.nextInt(99) + 1;
		System.out.println("정답>> "+target);
		
		JFrame f = new JFrame();
		f.setTitle("\uC22B\uC790\uB9DE\uCD94\uAE30 \uAC8C\uC784");
		f.getContentPane().setBackground(Color.PINK);
		
		f.setSize(385, 381);
		f.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("\uC22B\uC790\uB97C \uB9DE\uCDB0\uBCF4\uC790!");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//count = count + 1;
				count++;//증감연산자
				
				String data = text.getText();//"88" getText 글자를 가져올때
				int data2 = Integer.parseInt(data);
				text.setText(""); //setText 글자를 넣을때
				JOptionPane.showMessageDialog(f, "입력한 데이터는 "+ data2);
				
				
				if (target == data2) {//비교연산자의 결과는 true/ false
					JOptionPane.showMessageDialog(f, "정답입니다.");
					JOptionPane.showMessageDialog(f, count+"회 시도했습니다.");
					
				} else {

					JOptionPane.showMessageDialog(f, "정답이 아닙니다. 다시 시도하세요!!");
					
					if (target < data2) {
						JOptionPane.showMessageDialog(f, "너무 커요!!");
					} else {
						JOptionPane.showMessageDialog(f, "너무 작아요!!");
					}
				}
				
				
			}
		});
		b1.setBackground(Color.YELLOW);
		b1.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		b1.setBounds(40, 238, 287, 79);
		f.getContentPane().add(b1);
		
		text = new JTextField();
		text.setForeground(Color.BLUE);
		text.setBackground(Color.CYAN);
		text.setFont(new Font("돋움", Font.PLAIN, 30));
		text.setBounds(40, 129, 287, 79);
		f.getContentPane().add(text);
		text.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uB2F9\uC2E0\uC774 \uC0DD\uAC01\uD55C \uC22B\uC790\uB97C \uC785\uB825\uD558\uC138\uC694");
		lblNewLabel.setFont(new Font("굴림체", Font.PLAIN, 17));
		lblNewLabel.setBounds(51, 41, 256, 64);
		f.getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
		

	}
}
