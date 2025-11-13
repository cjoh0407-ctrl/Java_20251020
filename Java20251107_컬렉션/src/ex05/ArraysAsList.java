package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int[] iArr = new int[5]; // 이렇게 초기화 하기 보다는
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		iArr[3] = 40;
		iArr[4] = 50;
		
		int[] iArr2 = {10, 20, 30, 40, 50}; // 이렇게 하면 되는데 ArrayList에는 적용이 안된다.
		
		// 리스트 객체 생성하면서 초기화 가능한 방법!!!
		// 단, 수정 불가!!
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
	//	list2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println(list2);
		
		// Arrays.asList 는 간편하게 나열해서 사용할 수 있는데 수정 불가능하다.
		
		/*
		System.out.println(list2);
		list2.add(60);					// 60 추가
		System.out.println(list2);		 // 에러발생!
		*/
		

		list2 = new ArrayList<>(list2);
		list2.add(60);
		list2.remove(2);
		System.out.println(list2);
		
		
		Iterator<Integer> it = list2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		List<Person> person =
				new ArrayList<Person>(
						Arrays.asList(new Person(), new Person(), new Person()));
		
		
		
		
		
		
		
		
		
	}

}

class Person{}