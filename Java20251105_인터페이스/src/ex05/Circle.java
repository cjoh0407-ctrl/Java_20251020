package ex05;

public class Circle extends Shape { //상속
	
	public Circle() {} //디폴트 생성자
	public Circle(int x, int y) { // 인자, 인수 값 갖는 생성자
		super(x, y); // 상위 클래스 x, y 값 호출
	}
	
	@Override
	void droaw() { //메소드 오버라이딩
		System.out.println("원을 (" + getX() + ", " + getY() + ")에 그립니다.");
	}
	
}
