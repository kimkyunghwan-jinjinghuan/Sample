package sample;


//변수 num의 값에 따라 양수 또는 음수를 출력 (10 => 양수 -3 => 음수)

public class Exam03_5 {
	public static void main(String[] args) {
		
		int num = 10;
		
		// (조건) ?    :     ;
		// 양수, 음수의 기준이 되는 수 => 0 !!!
		
		String r = num > 0 ? "양수" : "음수";
		
		
			
		
		System.out.println(r); // 삼항 연산자
	}
}
