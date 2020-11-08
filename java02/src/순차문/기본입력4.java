package 순차문;

import java.util.Scanner;

public class 기본입력4 {

	public static void main(String[] args) {
		//모든 입력의 타입은 무조건 String으로 컴퓨터는 처리한다!!
		//Scanner는 RAM에 CPU가 꺼내 쓸 수 있게 복사해서 사용해야 하는 부품
		//한번 복사해오면 이 부품 안에서는 다시 복사 안해도 됨!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력>> ");
		int n11 = sc.nextInt(); //String -> int
		System.out.print("숫자2 입력>> ");
		int n22 = sc.nextInt(); //String -> int
		
		System.out.println(n11 + n22); //산술연산자
		
		
		
		
		

	}

}
