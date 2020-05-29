package sample;

public class ArrayExam5 {
	public static void main(String[] args) {
		int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

//배열의 요소를 꺼내었더니 또 배열이네
		for (int i = 0; i < arr1.length; i++) { // 큰 테두리의 행에 접근하고, 그 다음에는 세부요소접근하자
//				int[] arr2 = arr1[i];
//				arr2[1];
//				int value = arr1[i][1]; //이런게 하면 ㄴㄴ
			for (int j = 0; i < arr1[i].length; j++) { // 가변배열에 대처하는데 좋은 length필드속성
				// 꺼내어진 게 배열이니까arr1[i].length
//				System.out.println(arr1[i][j]);
			}

		}
	}
}