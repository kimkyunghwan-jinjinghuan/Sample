package sample;

public class Star2 {
	public static void main(String[] args) {
		for (int a = 5; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println(); 
			//line. print()�� println()����
			//println()�ٹٲ��� �Ͼ��. ���ڿ��� ������ �ٿ��� �� �ִ�.
			//printf()format�� ������ �� �ִ�.
		}
	}
}