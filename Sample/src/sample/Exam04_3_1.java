package sample;

import java.util.Scanner;

public class Exam04_3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month = scanner.nextInt();
		/* �Է¹��� month �� 3 ~ 5 �̸� �� ��� */
		/* �Է¹��� month �� 6 ~ 8 �̸� ���� ��� */
		/* �Է¹��� month �� 9 ~ 11 �̸� ���� ��� */
		/* �Է¹��� month �� 12 �Ǵ� 1 �Ǵ� 2 �̸� �ܿ� ��� */
		if(month == 3 || month ==4 || month ==5 ) {
			System.out.println("��");
		} else if(month == 6||month == 7||month == 8) {
			System.out.println("����");			
		} else if(month == 9||month == 10||month == 11) {
			System.out.println("����");
		} else if(month == 12||month == 1||month == 2) {
			System.out.println("�ܿ�");
		}
			
		//�� ���� ����� ������ ������
		//���δ� || OR���꾲�� ����, &&������ �Ἥ.
		
		scanner.close();
	}
}
