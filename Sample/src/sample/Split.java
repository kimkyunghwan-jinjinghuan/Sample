package sample;

public class Split {
	public static void main(String[] args) {
		String str = "Java Secure Coding";
		String[] strs = str.split(" ");
		
		//for-each, �����ѵ� �ε��� ������ �Ұ�.. each(:)�� ������� strs��.
		for (String s : strs) {
			System.out.println(s);
		}
	}
}