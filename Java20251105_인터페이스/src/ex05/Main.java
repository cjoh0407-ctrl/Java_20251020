package ex05;

public class Main {

	public static void main(String[] args) {

		Shape s1 = new Circle(10, 20); // Shape 타입의 s1 변수 선언, Circle인스턴스 생성 후 참조 값 대입
		s1.droaw();
		
		s1 = new Rectangle(30, 40);
		s1.droaw();
		
		s1 = new Shape(0, 0);
		s1.droaw();
		
	}

}
