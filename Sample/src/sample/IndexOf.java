package sample;

class IndexOf {
	public static void main(String args[]) {
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		int idx = -1;
		int count = 0; //�ʿ��ѰͰ� �˰����ϴ� �͵��� �غ�. �ε����� ī��Ʈ�� ��������.
		
		while(true) {
			idx = str.indexOf("Lorem", idx + 1);//��Ʈ���� ó������ ������ ��ť�� �˻��ϴ°���, char�ϳ��� while�� �ݺ��ϸ鼭 �˻��ϴ°���
			if(idx == -1) break; //�ڽ��� ���ΰ� �ִ� ���� ����� �� �극��ũ
			count++; //~�� ��� ī��Ʈ�ϰ� �Ѿ��
		}
		//while�׷��� �ݺ��ϴµ�. -1�� ��� �극��ũ
		
		
//�̷��� �ص�����
//		int idx = 0;
//		int count = 0;
//		while(true) {
//			idx = str.indexOf("e", idx);
//			if(idx == -1) break; //�ڽ��� ���ΰ� �ִ� ���� ����� �� �극��ũ
//			idx++
//			count++; //~�� ��� ī��Ʈ�ϰ� �Ѿ��
//		}
		//while�׷��� �ݺ��ϴµ�. -1�� ��� �극��ũ
		
		
		
		
		
		
		System.out.println(count);
		//���鰳��ã��
		
//		int idx = str.indexOf(" ");
//		System.out.println(idx);
		//����������� -1���.
		
		
//		int idx2 = str.lastIndexOf(" ");
//		System.out.println(idx2);
//
//		idx = str.indexOf(" ", idx + 1);
//		System.out.println(idx); 
//
//		idx2 = str.lastIndexOf(" ", idx2 - 1);
//		System.out.println(idx2);
		
	}
}

//�˻�, ã��, �����ͺм�, �˻�, �����ͺ��̽��˻�, 
// ���ڰ� ��� ��������. winmargo.tistory.com
// ggoreb.tistory.com
// ����Ŭ����, �ؽ�Ʈ���̴� 