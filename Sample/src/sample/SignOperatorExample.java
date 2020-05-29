package sample;

public class SignOperatorExample {
	public static void main(String[] args) {
		int row = 10;
		int remain = row % 2; //È¦Â¦±¸ºĞ
		boolean odd = remain == 1; //1ÀÌ ³²À¸¸é È¦¼ö´Ù ÂüÀÌ´Ï±î true°¡ ´ã±â°í. Áï, È¦->true
		
		System.out.println(odd);
		
		
		//char¶û '' ¹­¾î¼­ »ı°¢ÇØÁÖ°í
		char result01 = (odd == true ? 'È¦' : 'Â¦');//ÂüÀÌ¸é È¦·Î, ¾Æ´Ï¸é Â¦À¸·Î  
		String result02 = (odd == true ? "È¦¼ö" : "Â¦¼ö");
		
		System.out.printf("%s %s", result01, result02);
		
		
	}
}
