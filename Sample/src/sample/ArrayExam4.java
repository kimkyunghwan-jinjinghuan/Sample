package sample;

public class ArrayExam4 {
	public static void main(String[] args) {
		//���׹��� ��� �Ǿ��ڸ� ��� ���´�.
		char[] chars = { 'b', 'e', 'z', 'a', 'w'};
		
		for(int i=0; i<10000; i++) {
			int a = chars[0];
			int ran = (int)(Math.random() * chars.length);
			//�Ҽ����� �������� ��Ʈ��
			int b = chars[ran];
			int temp = a;
			a = b;
			b = temp;
			chars[0] = (char)a;
			chars[ran] = (char)b;
		}
		
	}
}