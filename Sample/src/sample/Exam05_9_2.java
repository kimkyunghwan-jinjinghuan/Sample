package sample;

public class Exam05_9_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
// 코드 작성

		// 1.split쓰는 방법
		String[] arr = file.split("/"); // 4 공백 home temp java.class라고 나옴
		System.out.println(arr);
		for (String string : arr) {
			if (string.equals("") != true) { // 같지않으면, 즉 다르면.
				System.out.println(string);
			}
		}
		// 기본자료형 비교 는== , 참조자료형은 equals()써야
		// 아무것도 없는 상태도 나오는거
		// 2.substring(+indexOf) 쓰는 방법
		int idx = 0; // 시작위치
		int e_idx = 0; // 마지막위치
		while (true) {
			e_idx = file.indexOf("/", idx);
			if (e_idx == -1) {
				System.out.println(file.substring(idx, e_idx)); // idx이상, e_idx미만
				break; // 가장 가까운 반복문 break
			}
			System.out.println(file.substring(idx, e_idx));
			idx = e_idx; // 요고, 요런 방법
			idx++;
		}

	}

}



//public class Main{
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4};
//		
//		for(int i=0; i<arr.length; i++) {
//			int value = arr[i];
//			System.out.println(value);
//		}
//		
//		// 같은 for-each구문
//		for(int value : arr)
//			System.out.println(value);
//	}
//}

