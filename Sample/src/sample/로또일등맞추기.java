package sample;

import java.util.Arrays;

public class �ζ��ϵ���߱� {
	public static void main(String[] args) {
		int[] lotto = { 3, 4, 11, 19, 22, 45 };
		int count =0;
		// �ζ� ����, ���⶧���� ����
		while (true) {
			// 1���� 45 ���ڸ� ��������
			int[] my = new int[6]; // ������ ����� ���� ���� ��ȣ����� �迭
			// 1~45���ڷ���

			// �ζǹ�ȣ6�� (1��) ����
			for (int i = 0; i < 6; i++) { // �迭�� ���̴� 6 �Դϴ�.
				int num = (int) (Math.random() * 45 + 1);
				my[i] = num;
			}
			// �ڹٿ��� �����ϴ� ���Ķ��̺귯�� ���. ��������.
			Arrays.sort(my); // my�迭

			
			// ���� ���� ���
			System.out.println(Arrays.toString(my));
			count++;
			System.out.println("Ƚ��:" + count);
			
			
			// ��ȣ��

			boolean result = Arrays.equals(lotto, my); // �ζǹ迭�̶� ���̹迭 ������ �ƴ��� �񱳸޼ҵ�� ��
			if (result == true) {
				System.out.println("1�� ��÷");
				//�õ� Ƚ���� ����ֱ�
				System.out.println(Arrays.toString(my));
				break;
			}

		}
	}
}
