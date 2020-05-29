package sample;

public class Exam04_6 {
	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				if (b < 5 -a +1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
		
		
		
		/* 강사님 코드
		 * 
		int space = 0;
		for (int row = 1; row <= 5; row++) {
		space = 5 - row;
			for (int col = 1; col <= 5; col++) {
				if (b < 5 -a +1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
		
		int space = 0;
		for (int row = 1; row <= 5; row++) {
		space = row - 1;
			for (int col = 1; col <= 5; col++) {
				if (b < 5 -a +1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
		*/
		
		/*
		 * 규칙발견하기(고1수학때 자주 봤던거, 패턴분석)
		 * 공백을 직접 하드코딩하는 것도 있지만, 
		 * 공백의 개수를 변수화해서 푸는 경우도 있네
		 * 노트에 흐름을 써가면서 패턴을 파악, 나머지 변수화. 알고리즘 정의 및 적용.
		 */
		
		
		
		
		
		
		
	}
}
//println은 출력하고 new line함.
//행 담당 반복문, 무엇을 반복할 것인지, 
//열 담당 반복문