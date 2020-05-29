package sample;

public class Exam03_2 {
	public static void main(String[] args) {
		int num = 456;
		
		int num02 = num - (num % 100);
		
		System.out.println(num02);
	}
}


//100으로 나눈 나머지로 다시 원래의 숫자에 빼주고 그걸 다시 담아서(대입연산자) 출력.
// 