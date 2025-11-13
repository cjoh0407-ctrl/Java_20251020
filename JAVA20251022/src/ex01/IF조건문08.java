package ex01;

import java.util.Scanner;

public class IF조건문08 {

	public static void main(String[] args) {

		/*
		 * 0 ~ 1 : 난수값 추출인데
		 * 1 ~ 100 값이 추출되게 하고 싶다.
		 * 곱하기를 하고 정수로 변환하고 싶으면 int를 붙여준다
		 */
		
		int num = (int)(Math.random() * 100) + 1;  // 0 ~ 1 사이 랜덤값 : 난수값 추출
		
		System.out.println(num);
		
		
	}

}
