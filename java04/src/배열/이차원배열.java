package �迭;

public class �������迭 {

	public static void main(String[] args) {
		int[][] seat = new int[5][10]; //�տ� [] ������(��), �ڿ� [] ������(��) : ����
		//50���� int������ ���������.
		
		//System.out.println(seat.length); //��
		//�� �ึ�� ������ �����־�� ��
		//System.out.println(seat[0].length); 
		
		seat[0][0] = 1;
		seat[0][1] = 1;
		seat[0][2] = 1;
		seat[2][6] = 1;
		seat[2][7] = 1;
		seat[2][8] = 1;
		seat[2][9] = 1;
									
		for (int i = 0; i < seat.length; i++) { //5 ��
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
	}

}
