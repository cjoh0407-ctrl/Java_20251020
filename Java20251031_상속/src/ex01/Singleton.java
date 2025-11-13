package ex01;

public class Singleton {
	
//	싱글톤 - 객체 생성을 1개만 생성해서 공유한다.

	private static Singleton singleton = new Singleton();
	
	private Singleton() { //외부에서 객체 생성 불가 private이기에!!
		
	}
	
	// 생성된 Singleton 객체를 사용(참조)할 수 있는 유일한 통로 역할.
	public static Singleton getInstance() {
		return singleton;
		
	}

}

class Sample{
	public Sample() {
		
	}
	
	static void func() {
		System.out.println("func()...");
	}
}

// static 객체 생성 없이 불러 올 수 있다. 지들끼리 논다?