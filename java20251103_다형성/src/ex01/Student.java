package ex01;

public class Student extends Person{
	
	private String school;
	
	public Student() {
		super();// 자동기입
	}
	
	public Student(String school) {
		super();// 자동기입
		this.school = school;
	}
	
	public Student(String name, int age, String school) {
		super(name, age); //상위클래스 전달
		this.school = school;
	}

	public void study() {
		System.out.println(getName() + "은 공부 중입니다.");
	}
}
