package ex01;

/*
 * 연습문제 4-7번
 */
import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {

		int money=0;
		int number=0;
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("선택> ");
			
			//키보드에 입력한 숫자를 컴퓨터는 문자로 인식하므로
			// Integer.parseInt를 통해서 정수로 변환해줌.
			number = Integer.parseInt(sc.nextLine());
			
			//if or switch
			
			switch(number){
				case 1 :
					System.out.println("예금액> ");
					money += Integer.parseInt(sc.nextLine());
					break;
				case 2 :
					System.out.println("출금액> ");
					money -= Integer.parseInt(sc.nextLine());
					break;
				case 3 :
					System.out.println("잔고> ");
					System.out.println(money);
					break;
				case 4 :
					break;
				default :
					System.out.println("1~4까지 정수만 입력해주세요!");
			}
			if(number == 4) break;
		}
		System.out.println("프로그램 종료!");
		
	}

}
