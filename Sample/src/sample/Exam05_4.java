package sample;

public class Exam05_4 {
	public static void main(String[] args) {
		char[] text = { 'g', ' ', 'f', 'm', 'n', 'c', ' ', 'w', 'm', 's', ' ', 'b', 'g', 'b', 'l', 'r', ' ', 'r', 'p',
				'_', 'l', 'q', 'j', '_', 'r', 'c', ' ', 'g', 'r', ' ', '`', 'w', ' ', 'f', '_', 'l', 'b' };
		// �ڵ� �ۼ� ? �ƽ�Ű�ڵ� ���� 10������ 2 ������Ų �� ���
		// ������Ų�� �ٽ� ������ִµ�...��Ʈ������ ���?

		for (int i = 0; i < text.length; i++) {
			char textNew = 0;
			if (text[i] != ' ') {
				textNew += (char)(text[i] + 2);
			}
			System.out.print(textNew);
		}
	}
}