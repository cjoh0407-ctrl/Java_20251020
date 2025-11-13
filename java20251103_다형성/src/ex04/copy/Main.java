package ex04.copy;

public class Main {
	public static void main(String[] args) {
			
		// 상위 클래스는 하위 클래스 참조 가능
		// 하위 클래스는 상위 클래스 참조 불가능
		// 참조는 가능하지만, 접근 할 수 있는 영역은 상위클래스 것만  가능
		A a = new A();
		a.test();		//  A funtion
				
		a = new B();	
		a.test();		//	B funtion
				
		a = new C();	
		a.test();		//	C funtion

		System.out.println("-------------------");
		
		
		//메소드 오버라이딩이 된 경우는, 하위클래스 메소드 사용 가능.
		a = new B(); a.test(); // B클래스의 test메소드 사용.
		a = new C(); a.test(); // C클래스의 test메소드 사용.
		
		System.out.println("------------------");
		System.out.println("------------------");
		
		a = new B();
		
		// B b = new A(); XXXXXX
		B b = (B)a;
		b.test();
		
		System.out.println("------------------");

		a = new C();
		C c = (C)a;
		c.test();
		
		System.out.println("------------------");
		
		A aa = null;
		
		C cc = new C();
		cc.test(); // C function
		
		aa = cc;
		aa.test(); // C function
		
		C cc1 = (C)aa;
		cc1.test(); // C function
		
		
		
		
		
	}

}
