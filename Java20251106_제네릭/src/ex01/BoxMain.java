package ex01;

public class BoxMain {

	public static void main(String[] args) {

		Box box = new Box();
		
		box.setItem(new Car());
		
		box.getItem();
		// box 자리에 Object obj 가 올수도 있고 Car가 올수도 있다.
		
		
	}

}

class Car{
	
}