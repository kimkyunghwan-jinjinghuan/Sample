package sample;

public class CharAt {
	public static void main(String[] args) { // ��Ʈ��Ŭ���� �迭��
		String text = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i); //�ϳ��� �ٲ㼭 �����.
			if (c >= 'y') {
				System.out.print((char) (c + 2 - 26));
			} else if (c != ' ') {
				System.out.print((char) (c + 2));
			} else {
				System.out.print(c);
			}

			// System.out.println((long)Math.pow(2, 38)); //2^38

//		String str = "Java Secure Coding";
//		int len = str.length();
//		for (int i = 0; i < len; i++) {
//			char c = str.charAt(i);
//			System.out.println(c);
//		}
		}
	}
}



