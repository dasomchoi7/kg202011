import java.io.IOException;
import java.net.ServerSocket;

public class 네트워크 {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9100);
		System.out.println("서버 시작됨. 고객의 요청을 기다리는 중..");
		while (true) {
			server.accept();//승인함
			System.out.println("고객의 요청을 승인함.");
		}
		
		

	}

}
