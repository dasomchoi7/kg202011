package 반복문;

public class 문제 {

	public static void main(String[] args) {
		
//		int start = 0;
//		while (start < 10) {
//			System.out.print("*");
//			start++;
//		}
		
		
		for (int i = 0; i < 10; i++){
			System.out.print("*");
		}

		System.out.println();
		
		for (int i=0; i<5; i++) {
			System.out.print("커피*");
		}
		
		System.out.println();
		
		for (int i =0; i<3; i++) {
			System.out.print("커피*우유");
		}
		
		System.out.println();
		
		for (int i = 0; i<3; i++){
			System.out.println(i + 1 +" : 짱!");
		}
	}

}
