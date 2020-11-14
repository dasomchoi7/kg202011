package 스태틱;

public class 직원고용 {

	public static void main(String[] args) {
		직원 s1 = new 직원("홍길동", "남", 25);
		직원 s2 = new 직원("김길동", "여", 22);
		직원 s3 = new 직원("송길동", "남", 24);
		
		System.out.println(직원.count+"명");
		//System.out.println(직원.sum/직원.count +"세");
		System.out.println(직원.getAvg()+ "세");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
