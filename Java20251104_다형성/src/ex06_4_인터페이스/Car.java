package ex06_4_인터페이스;

public interface Car {
	public void move();
	//인터페이스는 추상클래스만 있어야한다????
	
	default void stop() {
		System.out.println("=========");
	}
	
	public abstract void fillUp(); 
}
