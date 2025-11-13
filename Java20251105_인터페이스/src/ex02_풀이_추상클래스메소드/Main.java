package ex02_풀이_추상클래스메소드;

public class Main {

	public static void main(String[] args) {

		Animal dog = new Dog("초코", 3);
		Animal cat = new Cat("나비", 2);
		
		//Animal a = new Animal();
		//a.makeSound();
		
		System.out.println("----------------------");
		
		dog.showInfo();
		dog.makeSound();
		
		System.out.println("----------------------");
		
		cat.showInfo();
		cat.makeSound();
		
	}

}
