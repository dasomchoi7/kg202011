package ��Ʈ��ũ;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ��Ʈ��ũ�� {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) {
			
			Socket �� = new Socket("localhost",9100);
			System.out.println(i + "�� ���� ��û��.");
			
		}
		
		
		

	}

}
