package sample;

public class ArrayExam4 {
	public static void main(String[] args) {
		//뒤죽박죽 섞어서 맨앞자리 사람 섞는다.
		char[] chars = { 'b', 'e', 'z', 'a', 'w'};
		
		for(int i=0; i<10000; i++) {
			int a = chars[0];
			int ran = (int)(Math.random() * chars.length);
			//소수점을 때버리고 인트로
			int b = chars[ran];
			int temp = a;
			a = b;
			b = temp;
			chars[0] = (char)a;
			chars[ran] = (char)b;
		}
		
	}
}