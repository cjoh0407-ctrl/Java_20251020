package ex02_풀이;

public class Dog extends Animal {
	
	public Dog() {}
	public Dog(String name, int age) {
		super(name, age);
	}
	
//	public void showInfo() {
//		super.showInfo();
//	}
	
	@Override 
	//어노테이션, 오버라이딩 표시는 상위클래스에 있는 걸 재정의 했다는걸 알려줌.
	public void makeSound() {
		System.out.println("멍멍!");
	}
}
