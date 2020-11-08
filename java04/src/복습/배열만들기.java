package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		//배열을 만들 때 값들을 이미 알고 있는 경우 
		int[] s = {100, 90, 80, 70};
		//읽기 전용 변수 length => 배열 값들의 개수 : 4
		//배열은 위치를 가지고 값들을 꺼내거나 넣거나 한다.
		//위치값(index)은 0부터 시작
		s[0] = 99;
		
		//		 1		     2			3
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]); //4 ->실행순서  1,2,4,3
		} // i = index
		
		//for-each : 하나씩 (실무에서 많이 씀), 간단하게 출력하거나 연산 할 때.꺼내서 잠깐 쓸수는 있는데 넣을 수는 없다 
		for (int x : s) {
			System.out.println(x);	
		}//x=임시변수. 자동으로 0번째부터 하나씩 시작.
		
		// 배열을 만들 때  값들을 모르고 있는 경우
		int[] s2 = new int[4]; //new 복사의 의미, RAM의 공간을 복사한다., 자동초기화
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		
		
		
		

	}

}
