package sample;

//score�� 2�� ����� ��� ��¦��, 3�� ����� ��� ������, 2�� ����̸鼭 3�� ����� ��� ����¦��,
//�� ���� ���� score�� ��µǵ��� �ڵ� �ۼ�

public class Exam04_2_1 {
	public static void main(String[] args) {
		int score = 6;
		
		if((score % 2==0) && (score%3== 0)) {
			System.out.println("��¦");
		} 
		else if((score % 3)== 0) 
		{
			System.out.println("��");
		} 
		else if((score % 2==0))
		{
			System.out.println("¦");
		}
		
		// �ڵ� �ۼ�
		
		//���͸��ϴ� �ڵ� ������ ������ �ؾ��ϴ� ��쵵 ����.
		
		
		// �ֱ⸦ ���� �ϴ� ����������(%), ū������ �������� ���ڷ�, ū������ ���� �� �ְ�, 
		
		/*
		 int total = 0;
		 for(int i  =1; i<=1000; i++) {
			if( i%2 == 0 && i%7 == 0) {
				System.out.println(i);
				total += i;
			} else {
				
			}
		}
		System.out.println(total);
		 */
		
	
		
	}
}
