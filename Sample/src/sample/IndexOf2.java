package sample;

class IndexOf2 {
	public static void main(String args[]) {
		String str = "Lorem ipsum dolor sit amet,";
		
		String s= str.replace(" ", "\\"); // \백슬래시문자를 escaping해줘야
		//리플래시한거 받아서 써야죠. 원본의 복사본으로 그 복사본을 조작하여 사용. 원본은 유지하려는 성질.의도.
		System.out.println(s);
		System.out.println(str);
		}
		//while그룹을 반복하는데. -1인 경우 브레이크
		
}


// indexOf, replace, replaceAll(정규식을 지원하는), 유효성validation검사(형식을 만들어서, 서식을 만들어서), 패턴
// 정규식으로 정규식에 형식에, 정규식 틀에 맞게 데이터가 들어가서 검사가 된다. 필터링이 된다.
// 트림하는개 데이터베이스에 잘 쌓기 위해서 쓰는거네

// indexOf, replace, replaceAll, trim, split

// split의 기준에 따라 쪼개서 배열로 리턴함.