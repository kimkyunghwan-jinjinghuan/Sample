package sample;

import java.io.BufferedReader;
import java.util.Scanner;

public class ��� {
	public static void main(String[] args) {
		
		
		FileReader r = new FileReader("c:/dev/member.txt") throws IOException
		BufferedReader rr = new BufferedReader(r);
		
		String[] ��ü�ο� = new String[19];
		while(true) {
			String text = rr.readLine();
			if(text == null) break;
			String[] tt = text.split(",");
			for(int i=0; i<tt.length; i++) {
				��ü�ο�[count] = tt[i];
				count++;
			}
		}
		for(int i=0; i<tt.length; i++){{
			
			System.out.println(text);
			
		}
		//anci�� ����
		int num = Math.random() * ��ü�ο�.length);
		System.out.println("��ü�ο�", num);
	
	}
}