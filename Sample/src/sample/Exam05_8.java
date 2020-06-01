package sample;

public class Exam05_8 {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		// 코드 작성

			String[] strs = str.split(" "); //스플릿하고 스트링형 배열반환
			String temp = ""; 
			
			for (String string : strs) {
				temp += string + " ";
				System.out.println(temp);
			}
			
			
			//거꾸로 해본다
			String temp02 ="";
			for(int i =strs.length - 1; i>0; i--) {
				temp02 += strs[i];
				System.out.println(temp02);
			}
			
		
	}
}

//배열에 축적해서 축적할때 마다 출력해주는거 같은데
//String클래스를 이렇게 저렇게 조작

// 공백문자 나올때마다 문자열을 
//출력결과
//동해물과
//동해물과 백두산이
//동해물과 백두산이 마르고
//동해물과 백두산이 마르고 닳도록
//동해물과 백두산이 마르고 닳도록 하느님이
//동해물과 백두산이 마르고 닳도록 하느님이 보우하사
//동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라
//동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세