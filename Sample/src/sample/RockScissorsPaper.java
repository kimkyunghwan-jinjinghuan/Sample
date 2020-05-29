package sample;

public class RockScissorsPaper {
	public static void main(String[] args) {
		//난수
		//0.0 ~1.0 범위 random값으로 
		//가위(0), 바위(1), 보(2)
		// 가위<바위<보, 컴터가 나보다 한단계 높은 수를 가질때만 이기는거
 		double ran = Math.random(); //double실수8byte
		int com = (int)(ran*3);
		System.out.println(ran);
		System.out.println(ran);
		int player = 1;
		
		
		if(player == com) {
			System.out.println("비김");
		}else if((player+1)%3== com) {
			System.out.println("player 패");//컴터가 이긴거야
		}else {
			System.out.println("player 승");
		}
		
		
		if(player == 1 && com == 0) {
			System.out.println("플레이어 승!");
		} else if(player == 0 && com ==2) {
			System.out.println("플레이어 승!");
		}
		//수학공식 equation활용해서 더 짧게 만든다는거. 
		//많은 경우의 수를 확 줄여주는게 나머지정리...
		
		
	}
}

//continue는 컨티뉴 아래있는거 무시하고 반복continue하라는거.
//break는 서킷브레이커?
//탐색할때 continue
