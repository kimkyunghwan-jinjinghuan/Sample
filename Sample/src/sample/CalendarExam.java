package sample;

import java.util.Calendar;

// 달력형식에 맞게 출력(for, %) 연산자의 활용!!
public class CalendarExam {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//어떤 클래스와 객체를(라이브러리,API) 선택해서 그걸 활용할것인지. 
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		//왜 1을 더하지?
		//
		int month = c.get(Calendar.MONTH) + 1; //ctrl + shift + X로 대문자변환
		System.out.println(month);
		
		//마지막 날짜(현재 5월)
		//ctrl + space로 리스트보기(코드어시스턴스창이 뜸)
		int max = c.getActualMaximum(Calendar.DATE); //field는 전부다 대문자. 상수.변수.
		for(int i = 1; i<=max; i++) {
			System.out.println(" "+ (i<10 ? "0"+i :i));
			if(i%7==0) {
				System.out.println(); //7주기로 new line됨
			}
			
			
			
		}
	}
}
