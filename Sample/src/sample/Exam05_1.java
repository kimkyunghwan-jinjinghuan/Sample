package sample;

public class Exam05_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// �ڵ� �ۼ�

//		for (int i = 0; i < 10; i++) {
//			if (arr[i] % 2 == 0) {
//				System.out.println(arr[i]+1);
//			}
		
		String sep = "";//���۷�����

		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(sep+arr[i]);
				sep = ",";
			}

		}
	}
}



//�Ʒ��� ��� ����� �������� �ڵ� �ۼ�
//��� ���
//1, 3, 5, 7, 9

