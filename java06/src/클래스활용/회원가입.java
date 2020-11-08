package 클래스활용;

public class 회원가입 {

	public static void main(String[] args) {
		System.out.println("id\tpw\tname\ttel");
		System.out.println("-----------------------------");
		
		회원	i1 = new 회원("root","1234","park","011");
		System.out.println(i1);
		
		회원	i2 = new 회원("admin","1111","kim","012");
		System.out.println(i2);
		
		회원	i3 = new 회원(); //메서드 
		i3.id = "apple";
		i3.pw = "2222";
		i3.name = "song";
		i3.tel = "013";
		System.out.println(i3);
		
		회원	i4 = new 회원();
		i4.id = "melon";
		i4.pw = "3333";
		i4.name = "jung";
		i4.tel = "014";
		System.out.println(i4);

		
		
	}

}
