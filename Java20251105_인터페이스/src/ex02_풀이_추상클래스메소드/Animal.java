package ex02_풀이_추상클래스메소드;

public abstract class Animal {
	
	private String name;
	private int age;

	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + "살");
	}
	
	public abstract void makeSound();
	// abstract 추상 클래스 추상 메소드로 하여 
	// 				Animal 클래스로 객체생성 할 일 없게 만듬.
	
}
