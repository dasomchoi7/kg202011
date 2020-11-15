package 상속;

public class 베이비사용{

	public static void main(String[] args) {
		베이비 s1 = new 베이비();
		s1.age = 3;
		s1.cm = 30;
		s1.kg = 3;
		s1.move();
		s1.eat();
		
		System.out.println(s1);

	}

}
