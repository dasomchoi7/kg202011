package 상속;

public class 수퍼맨사용 {

	public static void main(String[] args) {
		수퍼맨 sup = new 수퍼맨();
		sup.age = 385; //사람
		sup.name = "클라크"; //사람
		sup.speed = 1000; //남자
		sup.eat(); //사람
		sup.run(); //남자
		sup.space(); //수퍼맨
		System.out.println(sup);

	}

}
