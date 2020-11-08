package 제어문;

import java.util.Date;

public class 날짜관련 {

	public static void main(String[] args) {
		Date date = new Date(); //한번쓰면 계속 쓸수 있음
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour+"시 "+ min + "분 "+ sec +"초" );
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int today = date.getDate();
		System.out.println(year + "년 "+ month+ "월 "+ today+ "일" );
		
		int day = date.getDay(); //요일
		System.out.println(day);
		
		if (day==0) {
			System.out.println("일요일");
		} else if (day==1) {
			System.out.println("월요일");

		}else if (day==2) {
			System.out.println("화요일");

		}else if (day==3) {
			System.out.println("수요일");

		}else if (day==4) {
			System.out.println("목요일");
			
		}else if (day==5) {
			System.out.println("금요일");
		}else if (day==6) {
			System.out.println("토요일");
		}
		
		//if-else if- else 좋은 코딩. if문만 쓰면 cpu가 계속 체크해서 안 좋음. 
		//else if는 조건이 맞으면 아래는 더 이상 실행시키지 않고, if가 break 걸려서 끝남!
		//else는 꼭 안써도 된다
		
		
	}

}
