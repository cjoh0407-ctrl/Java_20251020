package ex01;

public class ForEX04 {

	public static void main(String[] args) {

		
		/*
		 * 중첩 for문 - 구구단 출력 - 2단 출력
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ....
		 * 2 x 9 = 18
		 */

		for(int i=2; i<=5; i++) {
			System.out.println("-------------" + i + "단---------");
			for(int j=1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " + i * j);				
			}
		}
		
	}

}
