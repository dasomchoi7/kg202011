package 배열고급;

import java.awt.List;
import java.util.ArrayList;

public class 다양한타입 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//1.필통,휴대폰,1000을 가지고 있음
		list.add("필통");
		list.add("휴대폰");
		list.add(1000);
		
		//2.가방목록을 프린트
		System.out.println(list);
		
		//3.2000원이 추가 됨
		list.add(2000);
		//4.가방 목록을 프린트
		System.out.println(list);
		
		//5.필통을 빼라
		list.remove(0);
		System.out.println(list);
		
		//6.현재 나와있는 개수 프린트
		System.out.println("개수 : "+ list.size());
		
	}

}
