package ex01;

import java.util.Scanner;

public class 비교연산자 {

	public static void main(String[] args) {

		int numA = 5;
		int numB = 10;
		
		System.out.println(numA == numB);
		System.out.println(numA != numB);
		System.out.println(numA > numB);
		System.out.println(numA >= numB);
		System.out.println(numA < numB);
		System.out.println(numA <= numB);
		
		System.out.println("---------------");
		String s1 = "korea";
		String s2 = "korea";
		//System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("---------------");
		
		//Scanner sc = new Scanner(System.in);
		String s3 = new String("korea");
		String s4 = new String("korea");
		//System.out.println(s3 == s4); X
		System.out.println(s3.equals(s4));
		
		System.out.println("--------논리연산-------");
		
		numA = 5;
		numB = 10;
		int numC = 13;
		int numD = 9;
		
		System.out.println(numA < numB);
		System.out.println(numC < numD);
		
		System.out.println("----------AND---------");
		System.out.println((numA < numB)  &&  (numC < numD));
		
		System.out.println("----------||---------");
		System.out.println((numA < numB)  ||  (numC < numD));
	
		System.out.println("----------NOT---------");
		System.out.println(!(6>4));   // !부정
		
		System.out.println("----------XOR---------");
		System.out.println(15 ^ 12); // 1111, 1100, 0 0 1 1 
		
		System.out.println("---------삼항연산자(조건연산자)----------");
		// 항이 세개라서 삼항연산자라고 함
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 나이 입력 받아서, 20보다 크면 성년, 아니면 미성년
		 */
		
		/*
		System.out.println("나이 입력");
		int age = sc.nextInt();
		
		String state = (age>=20) ? "성년" : "미성년";
		System.out.println("당신은 " + state);
		*/
		
		/*
		 * 정수 입력 받아서, 2로 나누어서 나머지가 0이면 짝수, 아니면 홀수
		 */
		
		/*
		System.out.println("정수 입력");
		int number = sc.nextInt();
		
		String state = (number % 2 == 0) ? "짝수" : "홀수";
		System.out.println(number + "은(는)" + state);
		*/
		
		// 정수 입력 받아서, 3으로 나누어서 나머지 0,1,2 판별
		
		System.out.println("정수 입력");
		int number = sc.nextInt();
		// int state = (number % 3 == 0) ? 0 : 1;  ======첫번째
		int state = (number % 3 == 0) ? 0 : (number % 3 == 1) ? 1 : 2;
		System.out.println(number + "를 3으로 나눈 나머지는 " + state + "입니다.");
	}

}
