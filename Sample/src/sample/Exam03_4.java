package sample;

//나머지(%) 및 나누기(/) 연산자를 이용하여 제시된 숫자의 각 자리 합 구하기
public class Exam03_4 {
	public static void main(String[] args) {
		int num = 12345; 
		//length로 길이를 알아내면 아래 for문의 조건식(expression)에 활용.
		//cf.문(statement)
		int total = 0;
		/* 코드 작성 */

		// 주석처리 및 해제 ctrl+shift+c(Comment)
		// 깔때기처럼
		for (int i = 1; i < 5; i++) {
			total = total + (num % 10); // (num % 10)하면 5가 나머지로
			num = num / 10; // 결과는 1234
		}

		// 나누기연산자와 나머지연산자 둘다 사용

		System.out.println("각 자리 숫자의 합 : " + total);
	}
}

//나머지정리를 통해 각 자리수를 분리 시킬 수 있구나.