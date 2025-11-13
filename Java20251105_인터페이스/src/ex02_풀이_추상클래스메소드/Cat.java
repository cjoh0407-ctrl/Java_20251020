package ex02_풀이_추상클래스메소드;

public class Cat extends Animal {

	public Cat() {}
	public Cat(String name, int age) {
		super(name, age);
	}
	
//	public void showInfo() {
//		super.showInfo();
//	}
	
	@Override
	public void makeSound() {
		System.out.println("야옹!");
	}
}
