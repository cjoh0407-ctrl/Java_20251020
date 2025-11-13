package test;

public class Sample {

	public static void main(String[] args) {

		System.out.println("Hello, Java");
		System.out.println("Hello, Java");
		
		
		char var1 = 'A';
		char c1 = 65;

		char var2 = '가';
		//char c2 = 44032;
		char c2 = 0xAC00;
		
		System.out.println(var1);
		System.out.println(c1);
		
		System.out.println(var2);
		System.out.println(c2);
		
		
		// float에 8byte의 숫자를 집어넣고 싶으면 숫자 뒤에 f를 넣어라.
		float f1 = 10.5f;
		double d1 = 10.5;
		
		System.out.println(f1);
		System.out.println(d1);
		
		double f2 = 2147483648f;
		float f3 = 2147483658f;
		float f4 = 2147483668f;
		
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		//2.1474836E9	2.1474836 x 10 -> 2,147,483,600
		
		//문자 Char - 한글자만 가능
		
		/*기본자료형 기본타입 ---------------------------
		
		//정수 byte, char, short, int, long
		//실수 float, double
		//참, 거짓, boolean
		
		*/
		String str1 = "오\t창\t준";
		String str2 = "홍\n길\n동";
		
		System.out.println(str1);
		System.out.println(str2);
		
		//문자 String - 여러글자 가능 (첫 글자가 대문자다) 클래스라 그럼? 참조타입
		
		//			\ ' " / 문자 기입
		//			\t 탭키
		//			\n 줄바꿈 				역슬래시임
		
		//자동 형변환
		int a = 10;
		byte b = 20;
		
		a = b; // a = (int)b;
		
		System.out.println(a);
		System.out.println(b);
		
		
		//강제 형변환
		
		int intA = 1000;
		byte byteB = 50;
		
		System.out.println(intA);
		System.out.println(byteB);
		
		System.out.println("------강제 형변환-------");
		byteB = (byte)intA;
		
		System.out.println(intA);
		System.out.println(byteB);
		
		
		System.out.println("------실수 형변환-------");
		
		double dNum = 20.5;
		int iNum = 10;
		
		dNum = iNum; //자동 형변환 dNum = (double)iNum -> dNum = 10.0
		System.out.println("dNum : " + dNum);
		
		dNum = 20.5;
		iNum = (int)dNum; //강제 형변환 -> iNum = 20
		System.out.println("iNum : " + iNum);
		
		
		System.out.println("------정수 나누기-------");
		/*
		 * 정수 대 정수 연산 = 정수
		 * 정수 대 실수 연산 = 실수
		 * 실수 대 실수 연산 = 실수
		 * 정수 대 문자열 = 문자열
		 * 실수 대 문자열 = 문자열
		 */
		
		int iNum2 = 5;
		int iNum3 = 2;
		
		dNum = iNum2 / iNum3;   // = 5/2
		System.out.println("dNum : " + dNum);
		
		dNum = (double)iNum2 / iNum3;   // = 5.0/2
		System.out.println("dNum : " + dNum);
		
		dNum = iNum2 / (double)iNum3;   // = 5/2.0
		System.out.println("dNum : " + dNum);
		
		dNum = (double)iNum2 / (double)iNum3;   // = 5.0/2.0
		System.out.println("dNum : " + dNum);
		
		/*
		 * 변수의 이름 명명
		 * 
		 * 나이 : a (X), age (O)
		 * 
		 * 클래스명 기입 -> 사람 클래스 -> Person
		 * 
		 * 숫자 : n (X), Num (O)
		 * 
		 * 변수명 , 클래스명 -> 영문 대소문자, 숫자, 특수문자( _ , $ )
		 * 단, 숫자는 맨 앞에 기입할 수 없다, 
		 * age1 (O)
		 * _age1 (O)
		 * $age1 (O)
		 * 1age (X)
		 * 
		 * 자바에서 사용하고 있는 예약어는 사용 할 수 없다.
		 * ㄴ> class, public, package
		 */
		
		
		
		
	}

}
