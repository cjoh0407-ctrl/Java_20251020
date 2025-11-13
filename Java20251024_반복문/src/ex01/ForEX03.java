package ex01;

public class ForEX03 {

	public static void main(String[] args) {

		
		
		int sum = 0;
		int i=1;
		
		/*
		 * 초기값, 증가값을 변형 가능!!
		 */
		
		for( ; i <= 100; ) {
			if(i % 2 == 0)
				sum += i;
			
			i++;
		}
		
		System.out.println("합 : " + sum);
		
	}

}
