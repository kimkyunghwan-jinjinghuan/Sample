package sample;

public class ��ġ�ٲٱ� { //sorting�ϴ°���. 
	public static void main(String[] args) {
		int[] num = {3, 2, 1, 7, 4};
		
		//�ִ밪�� ���Ϸ���
		//min�� ���� ���� ���� ����
		//���ǽ��� �� �����ڸ� �ݴ��...
		
		
		
//		int min = 0; //�񱳸� ���� ���
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<num.length; i++) {
			int n = num[i];
			if(i < min) { 
				min = n; //�迭�� ��� �ϳ��ϳ��� ������ �������ΰ� ���ؾ��ϴ� �� ������ ����
			}
		}
		System.out.println(min);
		
//		int a = 10;
//		int b = 100;
//		System.out.printf();
//		int temp = 0;
//		temp = a;
//		b = a;
		
		
	}
}


// �ӽð���temp, ���۸��� �������ֽ�
// 