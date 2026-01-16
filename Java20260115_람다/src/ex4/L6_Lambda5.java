package ex4;

import java.util.function.Predicate;
//정수를 전달하면 짝수인지 홀수인지 판별하는 람다식 구현


public class L6_Lambda5 {
  
	public static void main(String[] args) {
		
		//Predicate사용
		Predicate<Integer> p = num -> num % 2 == 0 ? true : false;
		
		boolean f = p.test(12);
		
		if( f == true) {
			System.out.printf("짝수");
		}else {
			System.out.printf("홀수");
		}
	}

}
