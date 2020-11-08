package 복습;

public class 데이터연산자 {

	public static void main(String[] args) {
		// 기본 데이터 : 정수, 실수, 문자, 논리
		double 온도 = 25.5; //소수점 여덟째 짜리 
		float 몸무게 = 99.9F; // 소수점 넷째 짜리, f(대소문자 아무거나)붙여서 구분해야함.
		
		//계산의 대상이 아니면 정수가 아님
		
		byte age = 100; // -128~127
		short distance = 20000; // +-3만
		int high = 100; // +-21억
		long space = 2211111111L; //L(대소문사 상관없) 붙여서 구분 해줘야함  
		
		char gender = '남'; //한글자 
		
		boolean check = true; //or false 
		
		System.out.println(age + distance);
		System.out.println(age == distance);
		System.out.println(age != distance);
		
		// int와 int계산은 무조건 int! 
		int sum = high + 1; //101
		// 1.int sum 만들고
		// 2.high + 1
		// 3.대입
		
		int count = 5;
		
		//하나라도 double이면 계산의 결과는 무조건 double!
		System.out.println(sum/(double)count);
		//강제 타입 변환 (캐스팅 casting) => (변경하고자 하는 타입)변수명
		
		
		
			
	}

}
