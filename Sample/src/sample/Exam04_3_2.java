package sample;

import java.util.Scanner;

public class Exam04_3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		
		if(a >= b && a<=c) {
			System.out.println("중간값은" + a);
		} else if(b>=a && b<=c) {
			System.out.println("중간값은" + b);
		} else if(c<=b && c>=a) {
			System.out.println("중간값은" + c);
		} else if(c>=b && c<=a) {
			System.out.println("중간값은" + c);
		} else if(c<=b && c<=a) {
			System.out.println("중간값은" + c);
		} else if(c<=b && c>=a) {
			System.out.println("중간값은" + c);
		} 
		//같은숫자가 나왔을 경우에 대해서는??
		scanner.close();
	}
}

//한정된 카테고리가 있다면 swith-case문으로  그런데 '범위지정'하는게 어렵다. 