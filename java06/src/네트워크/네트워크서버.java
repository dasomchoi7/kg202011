package ��Ʈ��ũ;
import java.io.IOException;
import java.net.ServerSocket;

public class ��Ʈ��ũ���� {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9100);
		System.out.println("���� ���۵�. ���� ��û�� ��ٸ��� ��..");
		int count = 0;//�������� �ʱ�ȭ
		while (true) {
			server.accept();//������
			count++;
			System.out.println(count + ": ���� ��û�� ������.");
		}
		
		

	}

}
