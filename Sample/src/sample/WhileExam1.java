package sample;

public class WhileExam1 {
	public static void main(String[] args) {
		int num = 12345;

		int total = 0;

		while (num > 0) { 
			//조건식에 주로 불리언조건을. 반복횟수를 특정이벤트를 조건을 주었을때.
			int n = num % 10;

			total = total + n;

			num = num / 10;
		}//증감식

		System.out.println("각 자리 숫자의 합 : " + total);
	}
}