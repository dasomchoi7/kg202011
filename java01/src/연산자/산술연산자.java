package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 100 + 200 : 기호 (연산자)
		
		int x = 200;
		int y = 100;
		int sum = x + y;
		//int끼리의 계산은 무조건 int!
		System.out.println(sum);
		int point = 500;
		System.out.println(sum+point);
		
		int minus = x - y;
		int mul = x * y; //곱하기, 애스테리크
		int div = x / y; //나누기
		int odd = x % y; //나머지

		//한줄 복사 ctrl+alt+화살표아래
		//한줄 이동 alt+화살표 방향
		
		System.out.println("x + y = "+sum);
		System.out.println(x+" - "+y+" = "+(x-y));
		System.out.println(x + " * " + y+ " = "+(x*y));
		System.out.println(x + " / "+ y + " = "+(x/y));
		System.out.println(x+ " % " + y + " = " +(x%y));
	}

}
