package sample;

public class SignOperatorExample {
	public static void main(String[] args) {
		int row = 10;
		int remain = row % 2; //Ȧ¦����
		boolean odd = remain == 1; //1�� ������ Ȧ���� ���̴ϱ� true�� ����. ��, Ȧ->true
		
		System.out.println(odd);
		
		
		//char�� '' ��� �������ְ�
		char result01 = (odd == true ? 'Ȧ' : '¦');//���̸� Ȧ��, �ƴϸ� ¦����  
		String result02 = (odd == true ? "Ȧ��" : "¦��");
		
		System.out.printf("%s %s", result01, result02);
		
		
	}
}
