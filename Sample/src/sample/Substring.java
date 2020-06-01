package sample;

public class Substring {
	public static void main(String args[]) {
		String str = "Java 개발자 양성을 통한 취업연계과정!!"; 
		//new키워드 써도 되지만 이것도 된다네요.
		//나중에 StringBuffer, StringBuilder가 나온다.
		String s = str.substring(5, 8); 
		System.out.println(s);
		
		int idx = str.indexOf("취"); //해당 문자(열)에 해당하는 인덱스를 리턴함.
		System.out.println(str.substring(idx)); //인덱스이상, (미만) 범위로 해당하는 문자열 리턴함.
		// 인덱스와 실제 문자열값 사이 주고받기
	}
	
}

//indexOf, substring, replace