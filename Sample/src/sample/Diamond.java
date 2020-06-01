package sample;

public class Diamond {
	public static void main(String[] args) {
		int num = 11; //(0~10)

		for (int i = 0; i < num; i++) { //중첩for문으로 틀을 만들고
			for (int j = 0; j < num; j++) {
				if (i <= num / 2)// 위쪽 영역
				{
					if (i + j <= (num / 2) - 1)// 왼쪽 위 공백찍기, 4
						System.out.print(" ");
					else if (j - i >= (num / 2) + 1) // 오른쪽 위 공백찍기, 6
						System.out.print(" ");
					else
						System.out.print("*");// *찍기 // 5
				} else if (i > num / 2) { // 아래쪽 영역
					if (i - j >= (num / 2) + 1) // 왼쪽 밑 공백
						System.out.print(" ");
					else if (i + j >= (num / 2) * 3 + 1)// 오른쪽 밑 공백
						System.out.print(" ");
					else
						System.out.print("*"); // *찍기
				}
			}
			System.out.println();// 줄바꿈. 이것때문에 밑으로 내려가는거
		}
	}
}
