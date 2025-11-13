package ex01;

public class InheritanceMain {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 25, "천호중학교");
		s1.study();
		s1.eat();
		s1.age();
		
		System.out.println(s1);
		// toString - 멤버변수에 어떤 값이 있는지 확인할 때 
		//                 getter setter 사용하지 않고
		
		System.out.println("----------------------");
		
		Teacher t1 = new Teacher("삼장법사", 50, "수학");
		t1.teach();
		t1.eat();
		t1.age();

		System.out.println("----------------------");
		
		Programmer p1 = new Programmer("손오공", 30, "자바");
		p1.code();
		p1.eat();
		p1.age();
		
		System.out.println("----------------------");
		
		
		
		
	}

}
