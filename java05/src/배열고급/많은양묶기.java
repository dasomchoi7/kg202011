package �迭���;

import java.util.ArrayList;
import java.util.Date;

public class �����繭�� {

	public static void main(String[] args) {
		// �ٸ� Ÿ�Ե�, ũ�Ⱑ ����
		ArrayList list = new ArrayList();
		list.add("ȫ�浿");
		list.add(100);
		list.add(55.55);
		list.add(true);
		
		System.out.println("���� : " + list.size());
		System.out.println(list);
		
		Date date = new Date();
		list.add(date);
		
		System.out.println("���� : " + list.size());
		System.out.println(list);
		
		list.remove(3);
		System.out.println("���� : " + list.size());
		System.out.println(list);
		

	}

}
