package sample;

public class Exam05_8 {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		// �ڵ� �ۼ�

			String[] strs = str.split(" "); //���ø��ϰ� ��Ʈ���� �迭��ȯ
			String temp = ""; 
			
			for (String string : strs) {
				temp += string + " ";
				System.out.println(temp);
			}
			
			
			//�Ųٷ� �غ���
			String temp02 ="";
			for(int i =strs.length - 1; i>0; i--) {
				temp02 += strs[i];
				System.out.println(temp02);
			}
			
		
	}
}

//�迭�� �����ؼ� �����Ҷ� ���� ������ִ°� ������
//StringŬ������ �̷��� ������ ����

// ���鹮�� ���ö����� ���ڿ��� 
//��°��
//���ع���
//���ع��� ��λ���
//���ع��� ��λ��� ������
//���ع��� ��λ��� ������ �⵵��
//���ع��� ��λ��� ������ �⵵�� �ϴ�����
//���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ�
//���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮����
//���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����