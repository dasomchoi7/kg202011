import java.io.IOException;
import java.net.ServerSocket;

public class ��Ʈ��ũ {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9100);
		System.out.println("���� ���۵�. ���� ��û�� ��ٸ��� ��..");
		while (true) {
			server.accept();//������
			System.out.println("���� ��û�� ������.");
		}
		
		

	}

}
