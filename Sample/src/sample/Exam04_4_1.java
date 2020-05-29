package sample;

public class Exam04_4_1 {
	public static void main(String[] args) {
		int i = 0 ;
		int sum = 0;
		
		for(i= 1; i<=99; i++) { //배열의 사용으로 조건식에 등호를 잘 넣지 않아
			sum += i;
		}
		
		System.out.println(sum);
		
		// 1 ~ 99 까지의 합 구하기
		// 실행결과
		// 4950
	}
// 코드 작성
}