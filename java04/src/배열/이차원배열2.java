package �迭;

public class �������迭2 {

	public static void main(String[] args) {
		// 2���� �迭�� 1���� �迭�� ������ ��Ƴ��� ��.
		
		int[][] seat = new int[3][]; // 0,1,2�� (i)
		int[] s0 = new int[10];
		int[] s1 = new int[5];
		int[] s2 = new int[8];
		
		seat[0]=s0;
		seat[1]=s1;
		seat[2]=s2;
		
		for (int i = 0; i < seat.length; i++) { //3��
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		

	}

}
