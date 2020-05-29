package sample;

import java.io.BufferedReader;
import java.util.Scanner;

public class 명단 {
	public static void main(String[] args) {
		
		
		FileReader r = new FileReader("c:/dev/member.txt") throws IOException
		BufferedReader rr = new BufferedReader(r);
		
		String[] 전체인원 = new String[19];
		while(true) {
			String text = rr.readLine();
			if(text == null) break;
			String[] tt = text.split(",");
			for(int i=0; i<tt.length; i++) {
				전체인원[count] = tt[i];
				count++;
			}
		}
		for(int i=0; i<tt.length; i++){{
			
			System.out.println(text);
			
		}
		//anci로 저장
		int num = Math.random() * 전체인원.length);
		System.out.println("전체인원", num);
	
	}
}