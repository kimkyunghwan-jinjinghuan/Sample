package sample;

import java.util.Scanner;

public class Exam04_3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3�� �Է�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		
		if(a >= b && a<=c) {
			System.out.println("�߰�����" + a);
		} else if(b>=a && b<=c) {
			System.out.println("�߰�����" + b);
		} else if(c<=b && c>=a) {
			System.out.println("�߰�����" + c);
		} else if(c>=b && c<=a) {
			System.out.println("�߰�����" + c);
		} else if(c<=b && c<=a) {
			System.out.println("�߰�����" + c);
		} else if(c<=b && c>=a) {
			System.out.println("�߰�����" + c);
		} 
		//�������ڰ� ������ ��쿡 ���ؼ���??
		scanner.close();
	}
}

//������ ī�װ��� �ִٸ� swith-case������  �׷��� '��������'�ϴ°� ��ƴ�. 