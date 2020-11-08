package 클래스;

public class 부품사용 {

	public static void main(String[] args) {
		
		//변수의 주소값!
		Bag bag = new Bag();
		bag.id = "root";
		bag.name = "홍길동";
		bag.move();
		
		System.out.println(bag.id);
		System.out.println(bag.name);
	}

}
