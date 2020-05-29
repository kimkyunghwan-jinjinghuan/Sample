package sample;

class IndexOf {
	public static void main(String args[]) {
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		int idx = -1;
		int count = 0; //필요한것과 알고자하는 것들을 준비. 인덱스와 카운트할 변수설정.
		
		while(true) {
			idx = str.indexOf("Lorem", idx + 1);//스트링을 처음부터 끝까지 한큐에 검색하는건지, char하나씩 while로 반복하면서 검색하는건지
			if(idx == -1) break; //자신을 감싸고 있는 가장 가까운 걸 브레이크
			count++; //~인 경우 카운트하고 넘어간다
		}
		//while그룹을 반복하는데. -1인 경우 브레이크
		
		
//이렇게 해도ㅇㅋ
//		int idx = 0;
//		int count = 0;
//		while(true) {
//			idx = str.indexOf("e", idx);
//			if(idx == -1) break; //자신을 감싸고 있는 가장 가까운 걸 브레이크
//			idx++
//			count++; //~인 경우 카운트하고 넘어간다
//		}
		//while그룹을 반복하는데. -1인 경우 브레이크
		
		
		
		
		
		
		System.out.println(count);
		//공백개수찾기
		
//		int idx = str.indexOf(" ");
//		System.out.println(idx);
		//공백못나오면 -1출력.
		
		
//		int idx2 = str.lastIndexOf(" ");
//		System.out.println(idx2);
//
//		idx = str.indexOf(" ", idx + 1);
//		System.out.println(idx); 
//
//		idx2 = str.lastIndexOf(" ", idx2 - 1);
//		System.out.println(idx2);
		
	}
}

//검색, 찾기, 데이터분석, 검색, 데이터베이스검색, 
// 글자가 몇번 나오는지. winmargo.tistory.com
// ggoreb.tistory.com
// 워드클라우드, 텍스트마이닝 