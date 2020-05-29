package sample;

//score가 2의 배수인 경우 “짝”, 3의 배수인 경우 “쿵”, 2의 배수이면서 3의 배수인 경우 “쿵짝”,
//그 외의 경우는 score가 출력되도록 코드 작성

public class Exam04_2_1 {
	public static void main(String[] args) {
		int score = 6;
		
		if((score % 2==0) && (score%3== 0)) {
			System.out.println("꿍짝");
		} 
		else if((score % 3)== 0) 
		{
			System.out.println("쿵");
		} 
		else if((score % 2==0))
		{
			System.out.println("짝");
		}
		
		// 코드 작성
		
		//필터링하는 코드 순서를 역으로 해야하는 경우도 있음.
		
		
		// 주기를 갖게 하는 나머지연산(%), 큰수들을 원초적인 숫자로, 큰수들을 줄일 수 있게, 
		
		/*
		 int total = 0;
		 for(int i  =1; i<=1000; i++) {
			if( i%2 == 0 && i%7 == 0) {
				System.out.println(i);
				total += i;
			} else {
				
			}
		}
		System.out.println(total);
		 */
		
	
		
	}
}
