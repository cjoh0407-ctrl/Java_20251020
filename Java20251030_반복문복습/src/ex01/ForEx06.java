package ex01;

public class ForEx06 {

	public static void main(String[] args) {

		/*
		 * 2~5단 구구단 출력
		 * 2 단 2개
		 * 3 단 3개
		 * 4 단 4개
		 * 5 단 5개
		 * 
		*/

		
		for(int i = 2; i<=5; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
				if(i == j) break;
			}
			System.out.println("----------------");
		}

	}
}
