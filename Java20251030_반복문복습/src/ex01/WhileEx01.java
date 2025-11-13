package ex01;

public class WhileEx01 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		
		do {
			sum += i;
			++i;
			
		}while(i<=10);
		
			System.out.println("총합 : " + sum);
		
	}

}
