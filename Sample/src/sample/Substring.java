package sample;

public class Substring {
	public static void main(String args[]) {
		String str = "Java ������ �缺�� ���� ����������!!"; 
		//newŰ���� �ᵵ ������ �̰͵� �ȴٳ׿�.
		//���߿� StringBuffer, StringBuilder�� ���´�.
		String s = str.substring(5, 8); 
		System.out.println(s);
		
		int idx = str.indexOf("��"); //�ش� ����(��)�� �ش��ϴ� �ε����� ������.
		System.out.println(str.substring(idx)); //�ε����̻�, (�̸�) ������ �ش��ϴ� ���ڿ� ������.
		// �ε����� ���� ���ڿ��� ���� �ְ�ޱ�
	}
	
}

//indexOf, substring, replace