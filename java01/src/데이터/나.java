package 데이터;

public class 나 {

	public static void main(String[] args) {
		//ex) age = 100
		//	gender = '여'
		// eye = 1.0
		//food = true/false 
		// 내 나이는 100세입니다.
		// 나는 남입니다.
		// 내 시력은 1.0 입니다.
		// 나는 점심을 먹었나? true/false
		
		// 타입 변수명; : 램에 공간이 할당, 선언!
		// 자바는 선언할 때 램에 공간이 만들어진다!
		
		int age = 27;
		char gender = '여';
		double eye = 1.0;
		boolean food = true;
		food = false; //만든 후에 값 변경
		String name = "최다솜"; 
		//스트링(실): 홍--길--동  기본데이터가 아닌데 기본데이터인척 하는것. 대문자로 시작.
		
		System.out.println("내 이름은 "+name+" 입니다.");
		System.out.println("내 나이는 "+age+"세 입니다.");
		System.out.println("나는 "+gender+" 입니다.");
		System.out.println("내 시력은 "+eye+" 입니다.");
		System.out.println("나는 점심을 먹었나? "+food);
		
		//프로그램 실행시, 잠깐 저장해두는 공간은 RAM
		//공간에 저장된 값은 변경 가능 
		//공간 : 변수
		//공간의 이름 : 변수명
		//int x = 300; <데이터유형(datatype) 변수명 = 값;>
		//기본형 변수에는 값이 저장된다!
		//기본형 데이터가 들어가는 공간: 기본형 변수
		//기본형 데이터 : 정수, 실수, 문자, 논리
		// 			기본형처럼 문법을 제공하는 데이타: String(문자열)
	}

}
