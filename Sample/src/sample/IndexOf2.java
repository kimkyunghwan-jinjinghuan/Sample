package sample;

class IndexOf2 {
	public static void main(String args[]) {
		String str = "Lorem ipsum dolor sit amet,";
		
		String s= str.replace(" ", "\\"); // \�齽���ù��ڸ� escaping�����
		//���÷����Ѱ� �޾Ƽ� �����. ������ ���纻���� �� ���纻�� �����Ͽ� ���. ������ �����Ϸ��� ����.�ǵ�.
		System.out.println(s);
		System.out.println(str);
		}
		//while�׷��� �ݺ��ϴµ�. -1�� ��� �극��ũ
		
}


// indexOf, replace, replaceAll(���Խ��� �����ϴ�), ��ȿ��validation�˻�(������ ����, ������ ����), ����
// ���Խ����� ���ԽĿ� ���Ŀ�, ���Խ� Ʋ�� �°� �����Ͱ� ���� �˻簡 �ȴ�. ���͸��� �ȴ�.
// Ʈ���ϴ°� �����ͺ��̽��� �� �ױ� ���ؼ� ���°ų�

// indexOf, replace, replaceAll, trim, split

// split�� ���ؿ� ���� �ɰ��� �迭�� ������.