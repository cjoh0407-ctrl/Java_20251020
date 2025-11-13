package ex01;
/*
 *  1 ~ ?
 *  이때 총합이 10,000이상 되는 순간 ?의 값 찾기
 */
public class BreakExample02 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		
		while(true)	{
			i++;
			sum += i;
			
			if(sum >= 10000) {
				break;				
			}
			
		}
		System.out.println("총 합 : " + sum);
		System.out.println("i : " + i);
		System.out.println("프로그램 종료~!");
		
	}

}
