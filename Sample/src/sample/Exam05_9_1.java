package sample;

public class Exam05_9_1 {
	public static void main(String[] args) {
		String nowDate = "20150926";
// �ڵ� �ۼ�
		String s1 = nowDate.substring(0, 4);
		System.out.println(s1);
		
		String s2 = nowDate.substring(4, 6);
		System.out.println(s2);
		
		String s3 = nowDate.substring(6, 8);
		System.out.println(s3);
		String nowDate1 = s1+"-" + s2+"-"+ s3;
		System.out.println(nowDate1); // => [��°��] 2015-09-26
		
		
		
		String inputDate = "2015-09-26"; //�����ؼ� ���꽺Ʈ���ؼ� ���ϴ°� ���̰� �ٽ� �װ� ���
// �ڵ� �ۼ�
		inputDate = inputDate.substring(0,4)+"��"+
				inputDate.substring(5,7)+"��"+
				inputDate.substring(8)+"��";

		System.out.println(inputDate); // => [��°��] 2015�� 09�� 26��
	}
}