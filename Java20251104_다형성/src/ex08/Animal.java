package ex08;

public class Animal {
	
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
	
	public void makeSound() {
		System.out.println("동물이 소리를 냅니다.");
	}
	
}
