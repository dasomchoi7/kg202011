package 복습;

public class 우주선사용 {

	public static void main(String[] args) {
		//b1이 프로그래머가 원한 부품(대상):object(객체)
		//new를 가지고 클래스의 객체를 만든다.(생성)
		//new -> 객체 생성하는 키워드
		//멤버변수들이 복사가 됨.
		//클래스 이름과 똑같이 생긴 메서드 : 객체생성시 자동 호출 -> 생성자 (constructor)
		//->객체 생성시 멤버초기화
		우주선 b1 = new 우주선(50, 50, "우주선.jpg");
		System.out.println(b1);
		
		우주선 b2 = new 우주선(100, 100, "우주선.jpg");
		System.out.println(b2);
		
		우주선 b3 = new 우주선(200, 200, "우주선.jpg");
		System.out.println(b3);

	}

}
