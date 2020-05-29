package sample;
//값이 0이 아닌 배열요소의 합과 평균을 구하는 코드 작성
public class Exam05_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 0, 12, 0, 14, 0, 16, 0, 18, 0 };
// 코드작성
		int total = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				total += arr[i];
				count++;
			}
		
			System.out.println("총합" + total);
			System.out.println("평균" + (total/ (double)count));
		}
		
		//0아닌 것의 개수를 구해봐...카운트 해줘야해.
		
		
		
		
		
	}
}
