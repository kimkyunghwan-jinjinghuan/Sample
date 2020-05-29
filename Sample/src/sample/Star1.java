package sample;

public class Star1 {
	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println(); 
			//line. print()과 println()차이
			//println()줄바꿈이 일어난다.
			//printf()format을 지정할 수 있다.
		}
	}
}