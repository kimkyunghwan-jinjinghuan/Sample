package sample;

public class Test02 {
	public static void main(String[] args) {
		String s = "";
		System.out.println(System.currentTimeMillis()); //���н�Ÿ����
		for(int i=1; i<50000; i++) {
			s += i;
		}
		System.out.println(System.currentTimeMillis());
	
	
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<5000000; i++) {
			sb.append(i);
		}
		System.out.println(System.currentTimeMillis());
		System.out.println("end");
		
		//�� �̷� �ӵ��� ���̰� ���� ����???
		//���� �뷮�� ���ڿ� ó���Ҷ� StringBuffer �Ǵ� StringBuilder 
	
	
	
	}
}
