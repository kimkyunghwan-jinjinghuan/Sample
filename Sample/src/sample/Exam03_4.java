package sample;

//������(%) �� ������(/) �����ڸ� �̿��Ͽ� ���õ� ������ �� �ڸ� �� ���ϱ�
public class Exam03_4 {
	public static void main(String[] args) {
		int num = 12345; 
		//length�� ���̸� �˾Ƴ��� �Ʒ� for���� ���ǽ�(expression)�� Ȱ��.
		//cf.��(statement)
		int total = 0;
		/* �ڵ� �ۼ� */

		// �ּ�ó�� �� ���� ctrl+shift+c(Comment)
		// �򶧱�ó��
		for (int i = 1; i < 5; i++) {
			total = total + (num % 10); // (num % 10)�ϸ� 5�� ��������
			num = num / 10; // ����� 1234
		}

		// �����⿬���ڿ� ������������ �Ѵ� ���

		System.out.println("�� �ڸ� ������ �� : " + total);
	}
}

//������������ ���� �� �ڸ����� �и� ��ų �� �ֱ���.