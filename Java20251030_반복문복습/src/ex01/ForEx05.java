package ex01;

public class ForEx05 {

	public static void main(String[] args) {

		/*
		 * 1~100까지 홀수의 합을 구하시오. continue 이용
		 * 
		*/

		
		int sum = 0;
		
		
		for(int i = 0; i<=100; i++) {
			if (i%2 == 0)
				continue;
				
				sum += i;
		}
		System.out.println(sum);

	}
}
