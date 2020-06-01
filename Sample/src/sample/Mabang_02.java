package sample;

public class Mabang_02 {
	public static void main(String[] args) {
		int n = 5;
		int[][] mabang = new int[n][n];
// x : 세로축, y : 가로축
// 첫 좌표값
		int x = 0;
		int y = n / 2;
		mabang[x][y] = 1;
		for (int i = 2; i <= n * n; i++) {
			x = x - 1;
			y = y - 1;

			if (x < 0) {

			} else { // 그 외 경우
				if( y<0) {
					y=n-1;
				} else {
					//다정상인데 숫자가 입력되어 있는 경우
					x=x+2;
					y=y+1;
				}
			
			}
			mabang[x][y] = i; // 계산된 x와 y 좌표에 맞춰 다음 숫자 입력
		}
			for(int i =0; i<mabang.length; i++) {
				for(int j=0; j<mabang[i].length; j++) {
					System.out.println(mabang[i][j] + "/t");
				}
			}
	}
}


//가로선 x, 세로선 y
//경우의수를 문장으로 수식으로
//