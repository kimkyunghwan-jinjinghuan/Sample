package sample;

import java.util.Scanner;

public class Exam05_5 {
	public static void main(String[] args) {

		boolean isRun = true;// ���ѹݺ� ����
		int studentNum = 0;// �л� ��
		int[] scores = null;// �л��� ����
		Scanner scan = new Scanner(System.in);

		while (isRun) {
			System.out.println("============================================");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("============================================");
			System.out.print("���� > ");
			// �ݺ��Ǵ°Ű� �������� ���� �������ϱ���

			int selectNo = scan.nextInt();
			if (selectNo == 1) {
				// �ڵ� �ۼ�

				studentNum = scan.nextInt();
				scores = new int[studentNum]; // �Է¹��� ���ڷ� �迭����
				System.out.println("�л� �� �Է� >" + studentNum);

			} else if (selectNo == 2) {
				// �ڵ� �ۼ�
				for (int i = 0; i < scores.length; i++) {
					scores[i] = scan.nextInt();
				}

			} else if (selectNo == 3) {
				// �ڵ� �ۼ�
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scrores[%s] > %s", i, scores[i]);
				}

			} else if (selectNo == 4) { // ���ϴ°�
				// �ڵ� �ۼ�
				int sum = 0, max = 0, avg = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (scores[i] > max) {
						max = scores[i];
						avg = sum / scores.length;
						
					}
					
				}
				System.out.println("�ִ밪" + max);
				System.out.println("��հ�" + avg);

			} else if (selectNo == 5) {
				isRun = false;
			}
		}
		System.out.println("���α׷� ����");
		scan.close();
	}
}