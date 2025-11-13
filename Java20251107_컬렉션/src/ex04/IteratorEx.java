package ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(5);
		list.add(9);
		list.add(15);
		
		System.out.println(list);
		
		for(int i : list)
			System.out.print(i + " ");
		
		System.out.println("\n-------------Iterator--------------");
		
		// 반복자 획득
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) { //hasNext 다음에 어떤 값이 있니? 확인하는 메서드 has = 어떤 값이 있니?
			System.out.println(it.next()); // next 메서드는 그 다음 데이터를 참조함.
		}
		
	}

}
