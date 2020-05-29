package sample;

public class 위치바꾸기 { //sorting하는거임. 
	public static void main(String[] args) {
		int[] num = {3, 2, 1, 7, 4};
		
		//최대값을 구하려면
		//min의 값은 아주 적은 수로
		//조건식의 비교 연산자를 반대로...
		
		
		
//		int min = 0; //비교를 해줄 대상
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<num.length; i++) {
			int n = num[i];
			if(i < min) { 
				min = n; //배열에 요소 하나하나씩 돌리고 실질적인건 비교해야하니 그 조건을 기입
			}
		}
		System.out.println(min);
		
//		int a = 10;
//		int b = 100;
//		System.out.printf();
//		int temp = 0;
//		temp = a;
//		b = a;
		
		
	}
}


// 임시공간temp, 버퍼링과 설명해주심
// 