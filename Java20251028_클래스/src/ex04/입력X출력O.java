package ex04;

public class 입력X출력O {

	public static void main(String[] args) {

		
		Student s1 = new Student();
		s1.name = "안창현";
		s1.age = 29;
		s1.address = "강동구 천호동";
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.address);
		s1.study();
		String addr = s1.add();
		System.out.println(addr);
		
		
		System.out.println("----------------------");
		
		Student s2 = new Student();		
		s2.name = "선아영";
		s2.age = 28;
		s2.address = "강동구 암사동";
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.address);
		s2.study();
		
		addr = s2.add();
		System.out.println(addr);
		
	}
	
}

class Student{
	String name;
	int age;
	String address;

	void study() {
		System.out.println(name + " Java 공부 중 입니다.");
	}
	
	
	//함수명 : add. 반환타입(리턴값):String. 매개변수(입력값): 없음
	String add() {
		
		return address;
	}
	
}