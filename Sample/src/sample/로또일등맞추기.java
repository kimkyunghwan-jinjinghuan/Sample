package sample;

import java.util.Arrays;

public class 로또일등맞추기 {
	public static void main(String[] args) {
		int[] lotto = { 3, 4, 11, 19, 22, 45 };
		int count =0;
		// 로또 구매, 맞출때까지 구매
		while (true) {
			// 1부터 45 숫자를 랜덤으로
			int[] my = new int[6]; // 공간만 만든다 내가 뽑을 번호기록할 배열
			// 1~45숫자랜덤

			// 로또번호6개 (1장) 구매
			for (int i = 0; i < 6; i++) { // 배열의 길이는 6 입니다.
				int num = (int) (Math.random() * 45 + 1);
				my[i] = num;
			}
			// 자바에서 제공하는 정렬라이브러리 사용. 오름차순.
			Arrays.sort(my); // my배열

			
			// 구매 상태 출력
			System.out.println(Arrays.toString(my));
			count++;
			System.out.println("횟수:" + count);
			
			
			// 번호비교

			boolean result = Arrays.equals(lotto, my); // 로또배열이랑 마이배열 같은지 아닌지 비교메소드로 비교
			if (result == true) {
				System.out.println("1등 당첨");
				//시도 횟수도 찍어주기
				System.out.println(Arrays.toString(my));
				break;
			}

		}
	}
}
