package sample;

public class Star1 {
	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println(); 
			//line. print()�� println()����
			//println()�ٹٲ��� �Ͼ��.
			//printf()format�� ������ �� �ִ�.
		}
	}
}