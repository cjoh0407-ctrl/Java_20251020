package ex07;

public class Car extends Vehicle{

	private int type;
	
	Car() {}
	
	public Car(int type) {
		this.type = type;
	}
	
	public void showInfo(String brand, int year, String type) {
		super.showInfo(brand, year);
		System.out.println("차종: " + type);
	}
	
}
