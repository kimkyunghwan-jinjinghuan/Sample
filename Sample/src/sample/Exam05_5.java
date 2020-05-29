package sample;

import java.util.Scanner;

public class Exam05_5 {
	public static void main(String[] args) {

		boolean isRun = true;// 무한반복 상태
		int studentNum = 0;// 학생 수
		int[] scores = null;// 학생별 점수
		Scanner scan = new Scanner(System.in);

		while (isRun) {
			System.out.println("============================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("============================================");
			System.out.print("선택 > ");
			// 반복되는거가 무엇인지 따로 빼놔야하구나

			int selectNo = scan.nextInt();
			if (selectNo == 1) {
				// 코드 작성

				studentNum = scan.nextInt();
				scores = new int[studentNum]; // 입력받은 숫자로 배열생성
				System.out.println("학생 수 입력 >" + studentNum);

			} else if (selectNo == 2) {
				// 코드 작성
				for (int i = 0; i < scores.length; i++) {
					scores[i] = scan.nextInt();
				}

			} else if (selectNo == 3) {
				// 코드 작성
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scrores[%s] > %s", i, scores[i]);
				}

			} else if (selectNo == 4) { // 비교하는거
				// 코드 작성
				int sum = 0, max = 0, avg = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (scores[i] > max) {
						max = scores[i];
						avg = sum / scores.length;
						
					}
					
				}
				System.out.println("최대값" + max);
				System.out.println("평균값" + avg);

			} else if (selectNo == 5) {
				isRun = false;
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}