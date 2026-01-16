package ex1;

class Outer1{
	private int num=0;
	
	class Member{		// 외부에 공개하고 싶지 않고 내부에 숨기고 싶을 때
		void add(int n)	{ num += n;}
		int get() {return num;}
	}
}

public class L2_MemberInner {

	public static void main(String[] args) {
		
		Outer1 o1 = new Outer1();// 바깥 쪽 객체 생성
		
		Outer1.Member o1m1 = o1.new Member();// 안 쪽 객체 생성
		o1m1.add(5);
		int n = o1m1.get();
		System.out.println(n);

	}

}
