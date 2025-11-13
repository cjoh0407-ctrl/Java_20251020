package ex01;

public class Person {

	private String name; // 멤버 변수 생성!
	private int age;
	
	public Person(){} //디폴트 생성자
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	
	}
	public void eat() {
		System.out.println(name + "은 점심을 먹는다.");
	}
	
	public void age() {
		System.out.println("나이는 : " + age);
	}
	
	@Override // @ 어노테이션 = 안전장치, 검증장치
	//					상위클래스가 가지고 있는 메소드를 재정의
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
//	public String toString() {
//		return "이름 : " + name + ", 나이 : " + age;
//	}
	
	
	
}

// 수퍼클래스 부모클래스 상위클래스 person
// 서브클래스 자식클래스 하위클래스 student

// 하위 클래스는 상위 클래스에 있는 것들에 접근 가능하다.//private 제외.