package sample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

class Network { // 네트워크유틸, 서버와 통신하게 해주는 기능을. shift + alt + R 로 refactor
	public static void main(String[] args) {
		Network n = new Network();
		n.get();
		String result = n.get();
		System.out.println(result);
		
		int s_idx = 0;
		int e_idx = 0;
		// 슬래시스팬이 없을떄까지 반복
		while(true) {
			s_idx = result.indexOf("<span>", ++s_idx);
			e_idx = result.indexOf("</span>", s_idx++);
			if(e_idx == -1) {
				break;
			}
			System.out.println(result.substring(s_idx+6, e_idx));
		}
		
	}

	public String get() {
		int number = 0;
		StringBuffer response = new StringBuffer();
		try {
			URL url = new URL("http://ggoreb.com/python/html/number.html"); //이URL에 가서 해당주소에 맞는 파일에.
			URLConnection urlConnection = url.openConnection();
			InputStream in = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			String data = null;
			while ((data = reader.readLine()) != null) {
				response.append(data);
			}
			reader.close();
			isr.close();
			in.close();
		} catch (Exception e) { // 예외 클래스
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return response.toString();
	}
}