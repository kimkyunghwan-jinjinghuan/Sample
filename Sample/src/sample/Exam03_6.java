package sample;

import java.util.Scanner;


//대문자를 소문자로 변경 (소문자가 대문자보다 32만큼 더 큼, A의 코드 65 / a의 코드 97)
public class Exam03_6 {
	public static void main(String[] args) {
		/* 코드 작성 */
		
		//문자를 입력받아서 
		
		Scanner s = new Scanner(System.in);
		char big_letter = s.next().charAt(0);
		
		char small_letter =  (char)(big_letter + 32);
		//라이브러리, 클래스, 
		
		System.out.println("입력된 문자" + big_letter);
		System.out.println("변환된 문자" + small_letter);
		
	}
}

/* code written by KNH instructor
char ch = 'T';
char ch2 = (ch>= 'A' && ch <= 'Z') ? (char)(ch+32) : ch ;



int input = System.in.read();
System.out.println(input);

어떤 정보를 입력 받느냐
센서정보, 홍채정보, 타이핑, 


char ch2 = 
 	ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch;
 	




*/




