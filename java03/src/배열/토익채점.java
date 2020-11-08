package 배열;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		int[] 정답 = new int[990];
		int[] 내답 = new int[990];
		
		Random r = new Random(42); 
		//()안에 숫자를 넣으면 : 씨앗값, seed값 / 안 넣으면 계속 랜덤으로 숫자가 나옴.
		
		for (int i = 0; i < 정답.length; i++) {
			 정답[i] = r.nextInt(4)+1; //0~3=> 1을 더해줘서 1~4
		}
		for (int i = 0; i < 내답.length; i++) {
			 내답[i] = r.nextInt(4)+1; //0~3=> 1을 더해줘서 1~4
		}
		int jumsu=0;
		for (int i = 0; i < 정답.length; i++) {
			System.out.println(i + 1 + ": "+ 정답[i] + " <-> "+ 내답[i]);
			if (정답[i]== 내답[i]) {
				jumsu++;
			}
			
		} System.out.println("점수는 "+ jumsu +"점");

	}

}
