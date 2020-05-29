package sample;

public class Exam05_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 코드 작성

//		for (int i = 0; i < 10; i++) {
//			if (arr[i] % 2 == 0) {
//				System.out.println(arr[i]+1);
//			}
		
		String sep = "";//세퍼레이터

		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(sep+arr[i]);
				sep = ",";
			}

		}
	}
}



//아래의 출력 결과가 나오도록 코드 작성
//출력 결과
//1, 3, 5, 7, 9

