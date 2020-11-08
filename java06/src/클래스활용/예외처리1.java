package 클래스활용;

public class 예외처리1 {

	public static void main(String[] args) {
		System.out.println("여기에서 출발..");
		
		try {
			String[] name = {"홍길동", "박길동"}; //0,1
			name[2] = "송길동";
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("에러가 발생하든/ 발생하지 않든 무조건 실행");
			System.out.println("파일의 close()실행!!");
		}
		
		System.out.println("제가 실행이 될까요?");

	}

}
