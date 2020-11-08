package 클래스만들기;

//클래스 이름만 대문자로 시작 하도록 규칙!
public class Phone {
	//상태 => 멤버 변수
	public String color;
	public String company;
	
	//동작 => 함수(멤버 메서드)
	public void call() {
		System.out.println("전화하다");
	}
	public void internet() {
		System.out.println("인터넷 하다");
	}
	public void kakao() {
		System.out.println("카톡 하다");
	}

}
