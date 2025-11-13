package ex04;

public class VariableExchangeExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		//before
		System.out.println("unm1 : " + num1 + ", num2 : " + num2);

		//Exchange 두 수 변경
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("unm1 : " + num1 + ", num2 : " + num2);
		
		//byte = -128 ~ 127
		byte var1 = -128;

		var1 -= 2;
		
		//int n = 10;
		// n += 1 이거랑  n = n + 1 이랑 같다
		// sysout(n);
		
		System.out.println(var1);
	}

}
