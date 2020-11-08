package 연산자;

import javax.swing.JOptionPane;

public class 그래픽연습 {

	public static void main(String[] args) {
//		String name = JOptionPane.showInputDialog("이름을 입력"); //홍길동
//		System.out.println(name);
//		//int age = 100;
//		//외부에서 입력해서 변수에 넣어주는 경우는 
//		//컴퓨터는 무조건 String 처리함!
//		String age = JOptionPane.showInputDialog("나이를 입력");
//		int age2 = Integer.parseInt(age);
//		
//		System.out.println(age2+1+"세");

		//숫자 1 입력
		//숫자 2 입력
		//두 수의 합은 ~~
		//두 수의 차는 ~~
		//두 수의 곱은 ~~
		//두 수의 나눗셈은~~
		
		String n1 =JOptionPane.showInputDialog("숫자1 입력");
		String n3=JOptionPane.showInputDialog("숫자2 입력");
		int n2 =Integer.parseInt(n1);
		int n4 = Integer.parseInt(n3);
		
		System.out.println(n2+n4);
		System.out.println(n2-n4);
		System.out.println(n2*n4);
		System.out.println(n2/n4);
		
		//null, 없다라는 의미, 널
		JOptionPane.showMessageDialog(null, n2+n4);
	}

}
