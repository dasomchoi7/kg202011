package 순차문;

import javax.swing.JOptionPane;

public class 기본입력2 {
	// 기본입력1 이랑 같은데 기본데이터가 아니니까 equals 씀
	public static void main(String[] args) {
		String id1 = "root"; // 설정
		String id2 = JOptionPane.showInputDialog("아이디를 입력하세요"); //조그만 창 나오게 입력받기

		String pass1 = "abc123"; // 설정
		String pass2 = JOptionPane.showInputDialog("비밀번호를 입력하세요"); //조그만 창 나오게 입력받기
		
		//논리연산자 : and(&&, 조건이 다 맞아야함), or(||, 조건이 한개 이상 맞아야 함), not(!, 아니다)
		if (id1.equals(id2) && pass1.equals(pass2)) { // true
			System.out.println("합격!!");
		} else {// false
			System.out.println("불합격!!");
		}
		// ctrl+shift+f : 자동 format. 줄 깔끔하게 정리. 에러 있으면 안 먹힘.

	}

}
