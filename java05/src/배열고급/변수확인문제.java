package 배열고급;

public class 변수확인문제 {

	public static void main(String[] args) {
		//1. 수학 100, 영어 수학보다 10점 뺀 점수 두점수 프린트해서 확인 
		int[] su = {100};
		int[] eng = su.clone();
		//System.out.println("su : "+ su);
		//System.out.println("eng : "+ eng);
		eng[0]=90;
		for (int x : su) {
			System.out.print(x + " ");
		}System.out.println();
		for (int x : eng) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//2. int[] 수학점수목록 {100,99,88}; 영어점수는 수학점수의 두번째 점수만 77점으로 내려감
		// 두 과목의 점수 목록 프린트 해서 확인.
		int[] su1 = {100,99,88}; 
		int[] eng1 = su1.clone();
		eng1[1] = 77;
		for (int x : su1) {
			System.out.print(x + " ");
		}System.out.println();
		for (int x : eng1) {
			System.out.print(x + " ");
		}System.out.println();
		
		
		
	}

}
