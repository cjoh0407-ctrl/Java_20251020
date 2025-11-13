package ex02;

public class Main {

	public static void main(String[] args) {

		Teacher t1 = new Teacher();
		Student s1 = new Student();
		Person p1 = new Person();
		
		
		// 다형성 : 상위 클래스는 하위 클래스 참조 가능!
		// 하지만 접근해서 사용할 수 있는 영역은 아님. 참조만 가능.
		Person p2 = new Person();
		p2.pInfo();
	
		Person p3 = new Teacher();
		p3.func();		// p3이 Teacher클래스를 참조가능하지만, 접근은 Person에만!
						// 단, 메소드 오버라이딩이 되어 있으면 Teacher클래스 내 메소드 접근 가능
	
		Teacher t2 = (Teacher)p3; // p3이 참조타입이 상위 클래스니까. 이럴때는 형변환을 해줘야함.
		
		// Teacher t3 = new Person();  -> 하위 참조타입에서는 상위 타입을 참조 못함.
		
		Person p4 = new Student(); 
		
	}

}
