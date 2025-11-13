package ex05;

public class ExceptionEx05 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작...");

		try {
		func1(5, 2);
		}catch(Exception e) {
			System.out.println("예외 발생!!!!!");
		}
		System.out.println("프로그램 종료...");
		
		//반드시 출력되어야함
	}

	private static void func1(int i, int j) throws ArithmeticException {
		// 여기서 처리하지 않고 던져버린다. 어디로? 이 전 단계로??
		func2(i,j);
	}

	private static void func2(int i, int j) throws ArithmeticException {

		int result = i/j;
		System.out.println(result);
		
	}

}
