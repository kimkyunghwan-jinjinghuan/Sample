package sample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Network n = new Network();
		int number = n.get();
		
		// 2, 3
		//숫자 분리해내기. 216 -> 2, 1, 6
		int baseball3 = number % 10;
		int baseball2 = (number / 10) % 10;  // (number/10)이면 21이 남고 거기에 %연산해주면 1이 떨어지고
		int baseball1 = (number / 10 / 10) % 10; // 1이 남고
		
		System.out.println(baseball1);
		System.out.println(baseball2);
		System.out.println(baseball3);

		Scanner s = new Scanner(System.in);
		int inputNumber1 = s.nextInt();
		int inputNumber2 = s.nextInt();
		int inputNumber3 = s.nextInt(); //s스캐너로 입력받아준거
		System.out.println(inputNumber1);
		System.out.println(inputNumber2);
		System.out.println(inputNumber3); //출력해주고
		
		int strike = 0; // 스트라이크를 개수를 저장할 변수를 초기화해주고,
		int ball = 0; // 볼의 개수를 저장할 변수
		int out = 0; // 아웃의 개수를 저장할 변수
		/* 코드 작성
		   스트라이크와 볼 검사 조건문 작성 
		*/
		if(inputNumber1 == baseball1) { //서버에서 받아온 baseball1
			// 스크라이크
			strike = strike + 1; //변수에 상태를 기억시켜놓는다
		} else if(inputNumber1 == baseball2
				|| inputNumber1 == baseball3) {
			// 볼, inputNumber1!=baseball1인 경우에서 넘어와
			ball++;
		} else { //스트라이크, 볼 이도 저도 아니다
			out += 1;
		}
		
		
		if(inputNumber2 == baseball2) {
			// 스크라이크
			strike = strike + 1;
		} else if(inputNumber2 == baseball1
				|| inputNumber2 == baseball3) {
			// 볼
			ball++;
		} else {
			out += 1;
		}
		
		if(inputNumber3 == baseball3) {
			// 스크라이크
			strike = strike + 1;
		} else if(inputNumber3 == baseball1
				|| inputNumber3 == baseball2) {
			// 볼
			ball++;
		} else {
			out += 1;
		}
		// 아웃인 경우에는 아웃만 표시
		/*
		if(out == 3) {
			System.out.println("아웃");
		} else {
			System.out.printf("%sS/ %sB", strike, ball);
		}
		*/
		
		if(strike == 0 && ball == 0) {
			System.out.println("out => " + out);
		} else {
			System.out.println("스트라이크 => " + strike);
			System.out.println("볼 => " + ball);
		}
	}
}

class Number { //네트워크유틸, 서버와 통신하게 해주는 기능을. 
	public int get() {
		int number = 0;
		try {
			URL url = new URL("http://ggoreb.com/baseball/baseball.txt");
			URLConnection urlConnection = url.openConnection();
			InputStream in = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			StringBuffer response = new StringBuffer();
			String data = null;
			while ((data = reader.readLine()) != null) {
				response.append(data);
			}
			number = Integer.parseInt(response.toString()); //response를 number로 형변환
			reader.close();
			isr.close();
			in.close();
		} catch (Exception e) { //예외 클래스 
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return number;
	}
}