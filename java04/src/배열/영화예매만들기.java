package 배열;

import java.util.Scanner;

import javax.swing.JFrame;

public class 영화예매만들기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; // 자동초기화 {0,0,0,0,~~}
		int count = 0;
		final int PRICE = 10000; //final 수정불가, 대문자 표시, 상수
		
		while (true) {
			System.out.println("=====================");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			System.out.println("=====================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.print("예매할 좌석 번호 선택 (종료는 -1) >> ");
			int no = scan.nextInt();
			if (no == -1) {
				System.out.println("예약 시스템을 종료합니다.");
				System.out.println("예약 좌석 수 : "+ count + "개");
				System.out.println("예약 결제 금액: "+ count*PRICE + "원");
				
				// break; //while 종료
				System.exit(0); // 컴퓨터에게 프로그램 종료(0 문제없는데 내가 종료시키고싶음, -1 문제있어서 종료)
			}

			// no가 1인 경우!
			if (seat[no - 1] != 1) {
				seat[no - 1] = 1;
				count++;
				System.out.println("예매 완료 되었습니다.");

			} else {
				System.out.println("예매가 이미 된 자리입니다.");
				System.out.println("다른 자리 번호를 선택해주세요.");
			}

		}

	}

}
