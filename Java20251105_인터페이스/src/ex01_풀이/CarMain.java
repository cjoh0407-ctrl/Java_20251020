package ex01_풀이;

public class CarMain {

	public static void main(String[] args) {
		
		Vehicle car = new Car("현대", 2025, "SUV");
		// 상위클래스가 확장성 면에서 좋다
		// Car c = new Car();
		car.showInfo();
	}
}
