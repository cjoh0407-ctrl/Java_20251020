package ex01;

public class WhileEX02 {

	public static void main(String[] args) {

		/*
		 * 1 ~ 100까지 짝수의 합
		 */
		
		int sum = 0;
		int i = 0;
		
		while(i<100) {
			i++;
			if(i % 2 ==0)
				sum += i;
		}
		
		System.out.println("합 : " + sum);
		
		
		
	}

}
