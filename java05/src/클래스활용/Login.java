package 클래스활용;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	private static JTextField id;
	private static JTextField pw;

	public static void main(String[] args) {
		//기본틀 부품 필요
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uC77C\uAE30\uC7A5.png"));
		lblNewLabel.setBounds(12, 10, 460, 227);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 35));
		lblNewLabel_1.setBounds(22, 247, 92, 43);
		f.getContentPane().add(lblNewLabel_1);
		
		id = new JTextField();
		id.setForeground(Color.RED);
		id.setFont(new Font("굴림", Font.BOLD, 30));
		id.setBounds(126, 247, 315, 43);
		f.getContentPane().add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 35));
		lblNewLabel_1_1.setBounds(22, 300, 92, 43);
		f.getContentPane().add(lblNewLabel_1_1);
		
		pw = new JTextField();
		pw.setForeground(Color.RED);
		pw.setFont(new Font("굴림", Font.BOLD, 30));
		pw.setColumns(10);
		pw.setBounds(126, 300, 315, 43);
		f.getContentPane().add(pw);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//입력한 id,pw가 원래 id,pw와 일치하는지 체크
				String id2= id.getText(); //id 텍스트필드에 입력한 값 가지고옴
				String pw2 = pw.getText();//pw 텍스트필드에 입력한 값 가지고옴
				System.out.println("가지고 온 id: "+ id2);
				System.out.println("가지고 온 pw: "+ pw2);
				//원래 id/pw 지정
				String id3 = "root";
				String pw3 = "1234";
				
				if (id2.equals(id3) && pw2.equals(pw3)) { //and연산자: 조건이 모두 true일때.
					JOptionPane.showMessageDialog(f, "로그인 성공!");
					Diary d = new Diary();
					d.open();
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패!");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uB85C\uADF8\uC778.png"));
		btnNewButton.setBounds(28, 364, 274, 73);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				id.setText("");
				pw.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uB9AC\uC14B.png"));
		btnNewButton_1.setBounds(346, 353, 126, 98);
		f.getContentPane().add(btnNewButton_1);
		f.setSize(500, 500);
		f.setTitle("로그인 화면");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
	}
}
