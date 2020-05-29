package sample;

import java.util.Calendar;

// �޷����Ŀ� �°� ���(for, %) �������� Ȱ��!!
public class CalendarExam {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//� Ŭ������ ��ü��(���̺귯��,API) �����ؼ� �װ� Ȱ���Ұ�����. 
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		//�� 1�� ������?
		//
		int month = c.get(Calendar.MONTH) + 1; //ctrl + shift + X�� �빮�ں�ȯ
		System.out.println(month);
		
		//������ ��¥(���� 5��)
		//ctrl + space�� ����Ʈ����(�ڵ��ý��Ͻ�â�� ��)
		int max = c.getActualMaximum(Calendar.DATE); //field�� ���δ� �빮��. ���.����.
		for(int i = 1; i<=max; i++) {
			System.out.println(" "+ (i<10 ? "0"+i :i));
			if(i%7==0) {
				System.out.println(); //7�ֱ�� new line��
			}
			
			
			
		}
	}
}
