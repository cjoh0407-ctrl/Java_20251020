package ex01;
//. 온점이 속성 같은 것인가?
public class CharAtExo1 {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		
		
		
		
		char ch = subject.charAt(0); 
		// 몇번째인지 알 수 있다.
		// "자바 프로그래밍"에서 해당하는 index번호로 한 문자를 추출
		// 0 1 2 3 4 5 6 7
		
		System.out.println(ch);
		
		
		
		
		int len = subject.length(); 
		// 문자열 길이를 알 수 있다.
		// "자바 프로그래밍" 단어 갯수
		System.out.println("문자열 길이 : " + len);

		
		
		
		System.out.println("---------문자열 대체(변경)------------");
		System.out.println("before : " + subject);
		subject = subject.replace("자바", "파이썬");  
		// 첫 번째 문자를 두번째 문자로 변경
		// "자바 프로그래밍" 문장에서 자바를 파이썬으로 변경
		
		System.out.println("after : " + subject);
	
		
		
		
		System.out.println("---------문자열 잘라내기------------");

		String sub2 = subject.substring(2); 
		// index 0 1 2 3 4 5 6 7 --> 몇 번째에서부터 전부 다 추출
		System.out.println(sub2);
		
		
		
		String sub3 = subject.substring(1,3); 
		// index 0 1 2 3 4 5 6 7 
		//--> 4번째 위치에서 6번 전(5번)까지 추출, 즉 4, 5번 추출
		System.out.println(sub3);
		
		
		
		
		
		
		System.out.println("---------문자열 찾기------------");
		// 0 1 2 3 4 5 6 7 8
		
		int index = subject.indexOf("썬");
		//"파이썬 프로그래밍"에서 프로라는 단어는 몇번째 Index에 있는지?
		
		System.out.println("문자열 찾기 : " + index);
		// 만약 -1이 추출되면 해당하는 단어가 문자열에 없다는 것.
	
	
	
	
		
		
		System.out.println("---------문자열 분리------------");
		String[] sub4 = subject.split(" ");
		System.out.println(sub4[0]);
		System.out.println(sub4[1]);
		// String[] "파이썬 프로그래밍" 문자열을 split("요기") 기준으로 0, 1로 나눌 수 있다.
		
		
		
		
		
		System.out.println("---------문자열 합치기------------");
		String s = "대한";
		String s2 = "민국";
		// s에 있는 "대한"에 s2를 합친다. concat!!!!!!!
		String s3 = s.concat(s2);
		System.out.println(s3);
		
		
		

		
		
		
		
		
		
	}

}
