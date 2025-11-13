package ex06;

public class ExceptionEx06 {

	public static void main(String[] args) throws Exception {

		System.out.println("프로그램 시작...");

		
		func1(5, 2);
		
		System.out.println("프로그램 종료...");
		
		//반드시 출력되어야함
	}

	private static void func1(int i, int j) throws Exception {
		
		func2(i,j);
	}

	private static void func2(int i, int j) throws Exception {

		int result = i/j;
		System.out.println(result);
		
	}

}
