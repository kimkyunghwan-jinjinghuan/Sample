package sample;

public class Exam05_6 {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 95, 86 }, 
				{ 83, 92, 96 }, 
				{ 78, 83, 93, 87, 88 } 
				};
		int sum = 0;
		double avg = 0.0;
		int count = 0;
// �ڵ� �ۼ�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { // n��° ��ҹ迭 �ϳ��� ����
				System.out.println(arr[i][j]);
				sum += arr[i][j];
				count++; // �����ɶ����� ī����

			}

			avg =  (sum / (double)count); // �� �����Ͱ����� ��� ���ұ�? ��� �����Ҷ� ���� ī����
			System.out.println("�� : " + sum);
			System.out.println("��� : " + avg);
		}
	}
}