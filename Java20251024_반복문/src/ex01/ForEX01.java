package ex01;

public class ForEX01 {

	public static void main(String[] args) {

		
		
		int sum = 0;
		
		/*
		 * for(초기값 ; 조건 ; 증가값)
		 * 		조건을 만족하면 실행될 코드(실행코드)
		 * 실행 순서는
		 * 처음 : 초기값 -> 조건 -> 실행코드 -> 증가값
		 * 이후 : 조건 -> 실행코드 -> 증가값
		 */
		
		for(int i=1; i<=5; i++) {
			sum += i;
		}
		
		System.out.println("합 : " + sum);
		
	}

}
