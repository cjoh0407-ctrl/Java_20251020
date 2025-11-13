package ex03Interface;

public class Main {

	public static void main(String[] args) {
		
		Animal an1 = new Cat("나비", 2);
		Animal an2 = new Dog("초코", 3);
		
		an1.showInfo();
		an1.makeSound();
		
		System.out.println("-------------");
		
		an2.showInfo();
		an2.makeSound();
		
	}

}
