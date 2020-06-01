package sample;

public class Exam05_9_1 {
	public static void main(String[] args) {
		String nowDate = "20150926";
// 코드 작성
		String s1 = nowDate.substring(0, 4);
		System.out.println(s1);
		
		String s2 = nowDate.substring(4, 6);
		System.out.println(s2);
		
		String s3 = nowDate.substring(6, 8);
		System.out.println(s3);
		String nowDate1 = s1+"-" + s2+"-"+ s3;
		System.out.println(nowDate1); // => [출력결과] 2015-09-26
		
		
		
		String inputDate = "2015-09-26"; //추출해서 서브스트링해서 원하는거 붙이고 다시 그걸 출력
// 코드 작성
		inputDate = inputDate.substring(0,4)+"년"+
				inputDate.substring(5,7)+"월"+
				inputDate.substring(8)+"일";

		System.out.println(inputDate); // => [출력결과] 2015년 09월 26일
	}
}