package ex03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {

		Stack st = new Stack();			//Stack 은 클래스
		Queue q = new LinkedList();		//Queue 는 인터페이스
		// Queue인터페이스의 구현체인 LinkedList를 사용함.
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		System.out.println(st);
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println(q);
		
		st.pop();
		
		
	}

}
