package sample;

//배열 nums 각 요소의 순서가 랜덤으로 섞일 수 있도록 코드 작성

public class Exam05_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		
		for(int i=0; i<nums.length; i++) {
			//한놈과 랜덤으로 고른놈 비교연산 섞음
			int ran = (int)(Math.random()*nums.length);
			char temp = ' ';
			temp = nums[0];
			nums[0] = nums[ran];
			nums[ran] = temp;
		}
		System.out.println(nums); //이를 활용한 빙고게임
// 코드 작성
	}
}