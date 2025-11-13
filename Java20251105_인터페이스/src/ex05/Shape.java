package ex05;

public class Shape {

	private int x; // 변수 선언
	private int y;
	
	public Shape() {}	// 디폴트 생성자 생성
	public Shape(int x, int y) {	// 인자, 인수 값 갖는 생성자
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	
	void droaw() { //메서드
		System.out.println("도형을 (" + x + ", " + y + ")에 그립니다.");
	}
	
}
