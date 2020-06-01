package sample;

public class Mabang_01 {
	public static void main(String[] args) {
		int n = 5;
		int[][] mabang = new int[n][n];
		
		// x : 세로축, y : 가로축
		// 첫 좌표값
		int x = 0;
		int y = n / 2;
		mabang[x][y] = 1;
		
		
		
		for (int i = 2; i <= n * n; i++) {
			// 다음 숫자를 찍을 좌표 (좌측 대각선)
			x = x - 1;
			y = y - 1;
			
			
			if (x < 0) { // 세로축이 음수일때
				// 가로축이 음수일때
				// 가로축을 마방진 크기 가장 오른쪽 좌표로 지정
				// 가로축 세로축 정상일때ㅁ
				x = n - 1; //x에 음수가 발생하지 않게
				y = y - 1;	
				mabang[x][y] = i;
			
			
			
			} else { // 그 외 경우
			// 다음 위치에 입력된 숫자가 있다면
			// 원래 위치의 아래쪽 좌표로 지정
				
				x = x - 1;
				y = y + 1;	
				mabang[x][y] = i; // 계산된 x와 y 좌표에 맞춰 다음 숫자 입력. ㅇㅋ
			}
			
		}
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -2
//		음수인덱스에 대한 요청이 있으면 자바는 예외를 발생시킴
		
		// 출력
		for(int i=0;i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(mabang[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}