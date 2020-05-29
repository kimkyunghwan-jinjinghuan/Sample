package sample;

public class Exam05_4 {
	public static void main(String[] args) {
		char[] text = { 'g', ' ', 'f', 'm', 'n', 'c', ' ', 'w', 'm', 's', ' ', 'b', 'g', 'b', 'l', 'r', ' ', 'r', 'p',
				'_', 'l', 'q', 'j', '_', 'r', 'c', ' ', 'g', 'r', ' ', '`', 'w', ' ', 'f', '_', 'l', 'b' };
		// 코드 작성 ? 아스키코드 상의 10진수를 2 증가시킨 후 출력
		// 증가시킨걸 다시 출력해주는데...스트링으로 출력?

		for (int i = 0; i < text.length; i++) {
			char textNew = 0;
			if (text[i] != ' ') {
				textNew += (char)(text[i] + 2);
			}
			System.out.print(textNew);
		}
	}
}