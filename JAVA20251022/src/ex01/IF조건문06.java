package ex01;

import java.util.Scanner;

public class IF조건문06 {

	public static void main(String[] args) {
/*
		버스 요금 계산표
		요금 : 2000
		65세 이상 : 무료
		20세 ~ 64세 : 할인율 0%
		15세 ~ 19세 : 할인율 20%
		7세 ~ 14세 : 할인율 50%
		7세 미만 : 무료
		
		나이 xx은 xx요금 입니다.
	*/	
		
		/*
		int age = 25; 		//나이
		int money = 2000; 	//요금
		double rate = 0;	//할인율

		System.out.print("나이 " + age + "세는(은) ");
		
		if(age >= 65) {
			System.out.print("무료");
		}else if (age >= 20) {
			System.out.print(money + "원");
		}else if (age >= 15) {
			System.out.print(money * 0.2 + "원");
		}else if (age >= 7) {
			System.out.print(money / 2 + "원");
		}else {
			System.out.print("무료");
		}
		System.out.println("입니다.");
		
		System.out.println("--------프로그램 종료---------");
		*/
		
		int age = 24; //나이
		int fee = 2000; //요금
		double rate = 0; //할인율
		
		if(age >= 65) {
			fee = 0;
		}else if(age >= 20 & age < 65) { // 20 ~ 64
			rate = 0;
		}else if(age >= 15 & age < 20) { // 15 ~ 19
			rate = 0.2;
		}else if(age >= 7 & age < 15) { // 7 ~ 14
			rate = 0.5;
		}else {
			fee = 0;
		}
		
		if(fee != 0) {
			fee = (int)(fee * (1 - rate));			
		}
		
		System.out.println("나이 " + age + "세는 " + fee + "요금 입니다.");
	}

}
