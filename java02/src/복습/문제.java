package 복습;

public class 문제 {

	public static void main(String[] args) {
		// 1학기 성적: 체육 66점 수학 77점 영어 88점 국어 99점 모든 점수를 합해 평균을 구해주세요
		
		int 국 = 99, 영 = 88, 수 = 77, 체 = 66;
		int sum = 국 + 영 + 수 + 체;
		double avg = (double)sum/4;
		
		System.out.println("모든 점수의 합은 "+sum+"점 이고, 평균은  "+avg+"점 입니다.");
		
		// pi = 3.14, 반지름 2.2 원의 면적을 구해주세요. 
		// 원 면적 구하는 공식 = 파이 * r(반지름)^2
		
		final double PI = 3.14; //바꿀 수 없는 값 지정 => final, 대문자로 씀. 항상 똑같은 값 : 상수, 변경불가
		
		double myR = 2.2; 
		//자바는 카멜(낙타)표기법: 연결되는 단어 띄어쓰기 하는 부분은 대문자로. 파이썬은 뱀표기법 (my_r)
		
		System.out.println(PI * myR * myR);
		
		
		
	}

}
