package sample;

import java.util.Scanner;

public class Exam03_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int n = scanner.nextInt();
		
		boolean bool = (n % 11 == 0)? true : false;
		
		System.out.println(bool);
		/* 코드 작성 */
		
		//문제에서 요구하는 숫자의 특징을 
	}
}
