package ex08;

public class Dog extends Animal {
	
	public Dog() {}
	public Dog(String name, int age) {
		super(name, age);
	}
	
//	public void showInfo() {
//		super.showInfo();
//	}
	
	@Override
	public void makeSound() {
		System.out.println("멍멍!");
	}
}
