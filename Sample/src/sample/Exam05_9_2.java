package sample;

public class Exam05_9_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
// �ڵ� �ۼ�

		// 1.split���� ���
		String[] arr = file.split("/"); // 4 ���� home temp java.class��� ����
		System.out.println(arr);
		for (String string : arr) {
			if (string.equals("") != true) { // ����������, �� �ٸ���.
				System.out.println(string);
			}
		}
		// �⺻�ڷ��� �� ��== , �����ڷ����� equals()���
		// �ƹ��͵� ���� ���µ� �����°�
		// 2.substring(+indexOf) ���� ���
		int idx = 0; // ������ġ
		int e_idx = 0; // ��������ġ
		while (true) {
			e_idx = file.indexOf("/", idx);
			if (e_idx == -1) {
				System.out.println(file.substring(idx, e_idx)); // idx�̻�, e_idx�̸�
				break; // ���� ����� �ݺ��� break
			}
			System.out.println(file.substring(idx, e_idx));
			idx = e_idx; // ���, �䷱ ���
			idx++;
		}

	}

}



//public class Main{
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4};
//		
//		for(int i=0; i<arr.length; i++) {
//			int value = arr[i];
//			System.out.println(value);
//		}
//		
//		// ���� for-each����
//		for(int value : arr)
//			System.out.println(value);
//	}
//}

