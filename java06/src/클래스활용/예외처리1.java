package Ŭ����Ȱ��;

public class ����ó��1 {

	public static void main(String[] args) {
		System.out.println("���⿡�� ���..");
		
		try {
			String[] name = {"ȫ�浿", "�ڱ浿"}; //0,1
			name[2] = "�۱浿";
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("������ �߻��ϵ�/ �߻����� �ʵ� ������ ����");
			System.out.println("������ close()����!!");
		}
		
		System.out.println("���� ������ �ɱ��?");

	}

}
