package sample;

import java.io.File;

public class ContinueExam {
	public static void main(String[] args) {
		File file = new File("C:\\Windows\\System32\\drivers\\etc");
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			long fileSize = files[i].length();
			if (fileSize < 1000) { // 파일크기가 1000Byte 미만이면 아래 코드 무시
				continue;
			}
			System.out.println(files[i].getName() + " / " + fileSize);
		}
	}
}
//소프트웨어 세계에 툴을 다 만들어 놓거나 만드는 사람들이 있다는거.. 역사적 축적...
//API응용의 기발함. 