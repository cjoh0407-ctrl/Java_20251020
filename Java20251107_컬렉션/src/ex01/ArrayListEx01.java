package ex01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx01 {

	public static void main(String[] args) {
		//int -> Integer
		
		/*
		 * ArrayList ls = new ArrayList(); // 기본 10개의 배열을 생성한다.
		 * 
		 * ls.add("문자열"); 
		 * ls.add(10); // 정수 
		 * ls.add(12.5); //실수
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(50);	//5 --> new Integer(5) wapper라고 함
		list.add(new Integer(40));
		list.add(20);
		list.add(new Integer(0));
		list.add(10);
		list.add(new Integer(30));
		
		System.out.println(list);
		
		System.out.println(list.subList(1, 4)); 
		// .sublist(a, b)
		//	index 1번 부터 4의 전(3)까지 값을 순서대로 읽어옴.
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list2);
		
		Collections.sort(list); // Collections.sort();	정렬해주는 기능.
		System.out.println(list);
		
		System.out.println(list.get(3));// get(index); index 몇번째 값을 가져오라
		
		
		
		
		
		
		
		
	}

}
