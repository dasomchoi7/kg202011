package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		int s1; //저장될타입 변수명; RAM에 공간이 할당!
		//선언! 할 때 자바는 램에 공간이 할당!
		//선언된 위치가 이 변수가 살 수 있는 공간범위!
		
		int[] s = new int[10];// 3층
		System.out.println(s);
		System.out.println(s[0]); //첫번째 위치값
		//위치값은 0부터 시작
		
		s[0]=100;
		System.out.println(s[0]);

		//위치값 (index, 인덱스)은 0부터 시작!!
		//5번째에 500을 넣어서 프린트 : 위치값 4 (index)
		s[4]=500;
		System.out.println(s[4]);
		//마지막번째에 900을 넣어서 프린트 :위치값 9
		s[9]=900;
		System.out.println(s[9]);
		
		System.out.println();
		
		//배열 : int 값 1000개를 만들어서
		//		첫번째 100, 22번째 200, 55번째 300, 마지막번째 900 넣고 프린트
		int[] n = new int[1000];
		n[0]=100;
		n[21]=200;
		n[54]=300;
		
		System.out.println(n[0]);
		System.out.println(n[21]);
		System.out.println(n[54]);
	
		System.out.println(n.length); //읽기 전용
		//배열의 개수가 자동계산되어 들어가 있는 변수
		System.out.println(s[s.length-1]); //마지막 위치값
		
		
	}

}
