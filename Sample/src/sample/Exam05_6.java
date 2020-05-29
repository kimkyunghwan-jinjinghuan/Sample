package sample;

public class Exam05_6 {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 95, 86 }, 
				{ 83, 92, 96 }, 
				{ 78, 83, 93, 87, 88 } 
				};
		int sum = 0;
		double avg = 0.0;
		int count = 0;
// 코드 작성
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { // n번째 요소배열 하나씩 접근
				System.out.println(arr[i][j]);
				sum += arr[i][j];
				count++; // 누적될때마다 카운팅

			}

			avg =  (sum / (double)count); // 총 데이터개수는 어떻게 구할까? 요소 접근할때 마다 카운팅
			System.out.println("합 : " + sum);
			System.out.println("평균 : " + avg);
		}
	}
}