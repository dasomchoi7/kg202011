package Ŭ����Ȱ��;

public class ȸ������ {

	public static void main(String[] args) {
		System.out.println("id\tpw\tname\ttel");
		System.out.println("-----------------------------");
		
		ȸ��	i1 = new ȸ��("root","1234","park","011");
		System.out.println(i1);
		
		ȸ��	i2 = new ȸ��("admin","1111","kim","012");
		System.out.println(i2);
		
		ȸ��	i3 = new ȸ��(); //�޼��� 
		i3.id = "apple";
		i3.pw = "2222";
		i3.name = "song";
		i3.tel = "013";
		System.out.println(i3);
		
		ȸ��	i4 = new ȸ��();
		i4.id = "melon";
		i4.pw = "3333";
		i4.name = "jung";
		i4.tel = "014";
		System.out.println(i4);

		
		
	}

}
