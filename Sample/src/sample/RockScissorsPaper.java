package sample;

public class RockScissorsPaper {
	public static void main(String[] args) {
		//����
		//0.0 ~1.0 ���� random������ 
		//����(0), ����(1), ��(2)
		// ����<����<��, ���Ͱ� ������ �Ѵܰ� ���� ���� �������� �̱�°�
 		double ran = Math.random(); //double�Ǽ�8byte
		int com = (int)(ran*3);
		System.out.println(ran);
		System.out.println(ran);
		int player = 1;
		
		
		if(player == com) {
			System.out.println("���");
		}else if((player+1)%3== com) {
			System.out.println("player ��");//���Ͱ� �̱�ž�
		}else {
			System.out.println("player ��");
		}
		
		
		if(player == 1 && com == 0) {
			System.out.println("�÷��̾� ��!");
		} else if(player == 0 && com ==2) {
			System.out.println("�÷��̾� ��!");
		}
		//���а��� equationȰ���ؼ� �� ª�� ����ٴ°�. 
		//���� ����� ���� Ȯ �ٿ��ִ°� ����������...
		
		
	}
}

//continue�� ��Ƽ�� �Ʒ��ִ°� �����ϰ� �ݺ�continue�϶�°�.
//break�� ��Ŷ�극��Ŀ?
//Ž���Ҷ� continue
