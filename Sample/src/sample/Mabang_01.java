package sample;

public class Mabang_01 {
	public static void main(String[] args) {
		int n = 5;
		int[][] mabang = new int[n][n];
		
		// x : ������, y : ������
		// ù ��ǥ��
		int x = 0;
		int y = n / 2;
		mabang[x][y] = 1;
		
		
		
		for (int i = 2; i <= n * n; i++) {
			// ���� ���ڸ� ���� ��ǥ (���� �밢��)
			x = x - 1;
			y = y - 1;
			
			
			if (x < 0) { // �������� �����϶�
				// �������� �����϶�
				// �������� ������ ũ�� ���� ������ ��ǥ�� ����
				// ������ ������ �����϶���
				x = n - 1; //x�� ������ �߻����� �ʰ�
				y = y - 1;	
				mabang[x][y] = i;
			
			
			
			} else { // �� �� ���
			// ���� ��ġ�� �Էµ� ���ڰ� �ִٸ�
			// ���� ��ġ�� �Ʒ��� ��ǥ�� ����
				
				x = x - 1;
				y = y + 1;	
				mabang[x][y] = i; // ���� x�� y ��ǥ�� ���� ���� ���� �Է�. ����
			}
			
		}
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -2
//		�����ε����� ���� ��û�� ������ �ڹٴ� ���ܸ� �߻���Ŵ
		
		// ���
		for(int i=0;i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(mabang[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}