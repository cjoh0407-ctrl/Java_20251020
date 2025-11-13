package ex01;

public class BreakExample {

	public static void main(String[] args) {

		while(true)	{
			int num = (int)(Math.random()*6)+1; 
			//1~6사이 정수 랜덤하게 변수 num저장
			
			System.out.println(num);
			
			if(num==6)
				break;
		}
		System.out.println("프로그램 종료~!");
		
	}

}
