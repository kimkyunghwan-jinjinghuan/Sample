package sample;

import java.util.Scanner;


//�빮�ڸ� �ҹ��ڷ� ���� (�ҹ��ڰ� �빮�ں��� 32��ŭ �� ŭ, A�� �ڵ� 65 / a�� �ڵ� 97)
public class Exam03_6 {
	public static void main(String[] args) {
		/* �ڵ� �ۼ� */
		
		//���ڸ� �Է¹޾Ƽ� 
		
		Scanner s = new Scanner(System.in);
		char big_letter = s.next().charAt(0);
		
		char small_letter =  (char)(big_letter + 32);
		//���̺귯��, Ŭ����, 
		
		System.out.println("�Էµ� ����" + big_letter);
		System.out.println("��ȯ�� ����" + small_letter);
		
	}
}

/* code written by KNH instructor
char ch = 'T';
char ch2 = (ch>= 'A' && ch <= 'Z') ? (char)(ch+32) : ch ;



int input = System.in.read();
System.out.println(input);

� ������ �Է� �޴���
��������, ȫä����, Ÿ����, 


char ch2 = 
 	ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch;
 	




*/




