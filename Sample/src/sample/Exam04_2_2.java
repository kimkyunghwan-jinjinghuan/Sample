package sample;

public class Exam04_2_2 {
	public static void main(String[] args) {
		int year = 2019; // 연도
		/* 코드 작성 */
		
		
		if( year % 4 ==0) {
			System.out.println("윤년입니다");
		} else if( year % 100 == 0 ){
			System.out.println("평년입니다");
		} else if( year % 400 == 0) {
			System.out.println("윤년입니다");
		} else {
			System.out.println("평년입니다");
		}
	}
}