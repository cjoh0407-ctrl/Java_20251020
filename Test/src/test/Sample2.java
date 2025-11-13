package test;

public class Sample2 {

	public static void main(String[] args) {

		Person p = new Person();
		
		p.name = "오창준";
		p.age = 20;
		
		System.out.println(p.name);
		System.out.println(p.age);
		
		Student s = new Student();
		s.학과 = "컴퓨터공학과";
		s.학번 = "1234";
	}

}



class Person{
	
	String name;
	int age;
	
	void funcA() {
	
	}
	void funcB() {
		
	}
	void funcC() {
		
	}
}





class Student{
	String 학과;
	String 학번;
}