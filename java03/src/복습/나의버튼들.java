package ����;

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

public class ���ǹ�ư�� {
	private static JTextField text;
	
	private static int count = 0;

	public static void main(String[] args) {
		
		Random r = new Random();
		int target = r.nextInt(99) + 1;
		System.out.println("����>> "+target);
		
		JFrame f = new JFrame();
		f.setTitle("\uC22B\uC790\uB9DE\uCD94\uAE30 \uAC8C\uC784");
		f.getContentPane().setBackground(Color.PINK);
		
		f.setSize(385, 381);
		f.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("\uC22B\uC790\uB97C \uB9DE\uCDB0\uBCF4\uC790!");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//count = count + 1;
				count++;//����������
				
				String data = text.getText();//"88" getText ���ڸ� �����ö�
				int data2 = Integer.parseInt(data);
				text.setText(""); //setText ���ڸ� ������
				JOptionPane.showMessageDialog(f, "�Է��� �����ʹ� "+ data2);
				
				
				if (target == data2) {//�񱳿������� ����� true/ false
					JOptionPane.showMessageDialog(f, "�����Դϴ�.");
					JOptionPane.showMessageDialog(f, count+"ȸ �õ��߽��ϴ�.");
					
				} else {

					JOptionPane.showMessageDialog(f, "������ �ƴմϴ�. �ٽ� �õ��ϼ���!!");
					
					if (target < data2) {
						JOptionPane.showMessageDialog(f, "�ʹ� Ŀ��!!");
					} else {
						JOptionPane.showMessageDialog(f, "�ʹ� �۾ƿ�!!");
					}
				}
				
				
			}
		});
		b1.setBackground(Color.YELLOW);
		b1.setFont(new Font("���� ���", Font.PLAIN, 30));
		b1.setBounds(40, 238, 287, 79);
		f.getContentPane().add(b1);
		
		text = new JTextField();
		text.setForeground(Color.BLUE);
		text.setBackground(Color.CYAN);
		text.setFont(new Font("����", Font.PLAIN, 30));
		text.setBounds(40, 129, 287, 79);
		f.getContentPane().add(text);
		text.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uB2F9\uC2E0\uC774 \uC0DD\uAC01\uD55C \uC22B\uC790\uB97C \uC785\uB825\uD558\uC138\uC694");
		lblNewLabel.setFont(new Font("����ü", Font.PLAIN, 17));
		lblNewLabel.setBounds(51, 41, 256, 64);
		f.getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
		

	}
}
