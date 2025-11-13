package ex01;

public class WhileEX01 {

	public static void main(String[] args) {

		/*
		 * int sum=0;
		 * 
		 * for(int i=1; i<=5; i++) {
		 * 		sum += i;
		 * }
		System.out.println("합 : " + sum);
		 */
		
		/*//////////////////////////// 첫번째 방법
		int sum = 0;
		int i = 0;
		
		while(i<5) {
			i++;
			sum += i;
		}
		
		System.out.println("합 : " + sum);
		*/
		
		/*//////////////////////////// 두번째 방법
		int sum = 0;
		int i = 1;
		
		while(i<=5) {
			sum += i;
			i++;
		}
		
		System.out.println("합 : " + sum);
		 */
		
		/*//////////////////////////// 세번째 방법
		int sum = 0;
		int i = 1;
		
		while(i<=5) 
			sum += i++;
		
		System.out.println("합 : " + sum);
		 */
		
		// 보통 첫번째 두번째 방법을 많이 사용한다//
		
		int sum = 0;
		int i = 0;
		
		while(i<5) {
			i++;
			sum += i;
		}
		
		System.out.println("합 : " + sum);
		
		
	}

}
