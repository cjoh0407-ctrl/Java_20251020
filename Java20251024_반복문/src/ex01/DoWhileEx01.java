package ex01;

public class DoWhileEx01 {

	public static void main(String[] args) {

		/*
		 * 1~5까지 합 구하기
		 */
		
		int sum = 0;
		
		int i = 0;
		
		do {				//여기서 한 번 보장 해줌.
			i++;
			sum += i;
		}while(i<5);
		
		System.out.println("합 : " + sum);
	}

}
