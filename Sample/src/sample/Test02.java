package sample;

public class Test02 {
	public static void main(String[] args) {
		String s = "";
		System.out.println(System.currentTimeMillis()); //유닉스타임찍어냄
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
		
		//왜 이런 속도의 차이가 나는 거지???
		//완전 대량의 문자열 처리할때 StringBuffer 또는 StringBuilder 
	
	
	
	}
}
