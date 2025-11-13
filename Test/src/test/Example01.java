package test;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		/*
		 * ------------- 출력 예시 -------------
		 * 이름 : 홍길동				name
		 * 나이 : 30					age
		 * 주소 : 서울시 천호동			address
		 * 몸무게 : 77.5kg			weight
		 */
		
		/*
		String name = "오창준";
		int age = 30;
		String address = "서울시 천호동";
		double weight = 77.5;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("몸무게 : " + weight + "kg");
		 */

		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();		
		int age = Integer.parseInt(sc.nextLine());		
		//int age = sc.
		String address = sc.nextLine();
		double weight = sc.nextDouble();
				
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("몸무게 : " + weight + "kg");
		
		System.out.println("end!!");
		
		
	}

}


