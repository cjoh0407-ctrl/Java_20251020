package ex05;

public class Rectangle extends Shape{
	
	public Rectangle(){}
	public Rectangle(int x, int y) {
		super(x, y);
	}
	
	@Override
	void droaw() {
		System.out.println("사각형을 (" + getX() + ", " + getY() + ")에 그립니다.");
	}
	
}
