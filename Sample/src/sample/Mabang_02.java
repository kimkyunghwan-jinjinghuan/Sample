package sample;

public class Mabang_02 {
	public static void main(String[] args) {
		int n = 5;
		int[][] mabang = new int[n][n];
// x : ������, y : ������
// ù ��ǥ��
		int x = 0;
		int y = n / 2;
		mabang[x][y] = 1;
		for (int i = 2; i <= n * n; i++) {
			x = x - 1;
			y = y - 1;

			if (x < 0) {

			} else { // �� �� ���
				if( y<0) {
					y=n-1;
				} else {
					//�������ε� ���ڰ� �ԷµǾ� �ִ� ���
					x=x+2;
					y=y+1;
				}
			
			}
			mabang[x][y] = i; // ���� x�� y ��ǥ�� ���� ���� ���� �Է�
		}
			for(int i =0; i<mabang.length; i++) {
				for(int j=0; j<mabang[i].length; j++) {
					System.out.println(mabang[i][j] + "/t");
				}
			}
	}
}


//���μ� x, ���μ� y
//����Ǽ��� �������� ��������
//