package sample;

import java.util.Scanner;

public class Exam03_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int n = scanner.nextInt();
		
		boolean bool = (n % 11 == 0)? true : false;
		
		System.out.println(bool);
		/* �ڵ� �ۼ� */
		
		//�������� �䱸�ϴ� ������ Ư¡�� 
	}
}
