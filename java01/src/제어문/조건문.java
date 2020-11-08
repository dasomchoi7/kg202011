package 제어문;

import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		//이름 hong
		//취미 run
		//소속 kg
		//-----
		//당신의 이름은 hong
		//당신의 취미는 run
		//당신의 소속은 kg
		
		 Scanner sc = new Scanner(System.in); 
		 //new scanner 한번 입력하면 다시 입력 할 필요 없음. 여러번 사용 가능. 
		 
		 System.out.print("이름 입력>> ");
		 String name = sc.next();
		
		 System.out.print("취미 입력>> ");
		 String hh = sc.next();
		 
		 System.out.print("소속 입력>> ");
		 String gg = sc.next();
		 
		 System.out.println("당신의 이름은 "+ name);
		 System.out.println("당신의 취미는 "+hh);
		 System.out.println("당신의 소속은 "+ gg);
		 
		 
		 
		 
		 
	}

}
