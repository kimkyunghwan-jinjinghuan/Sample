package sample;

public class Split {
	public static void main(String[] args) {
		String str = "Java Secure Coding";
		String[] strs = str.split(" ");
		
		//for-each, 간결한데 인덱스 조작이 불감.. each(:)의 대상으로 strs를.
		for (String s : strs) {
			System.out.println(s);
		}
	}
}