package ex02;

public class BoxMain {

	public static void main(String[] args) {

		/*
			Car가 의미하는 것은 Box 클래스에 있는 T가 Car란 것을 의미한다.
			즉 T를 Car로 변경해서 컴파일시에 Box.class 파일이 생성되나.
		*/
		
		Box<Car> box = new Box<Car>();
		
		/*
		 * box.setItem("new Car()");
		 * 이 코드는 에러가 발생한다.
		 * 이유는 box.setItem(Car car)이므로 Car 클래스 객체만 전달이 가능하다
		 * 하지만, 지금은 "new Car()"란 문자열을 전달하려고 시도했기 때문에 에러가 발생한다.
		 * 즉 타입이 일치하지 않기 때문이다!
		 */		
		
		//box.setItem("new car()");
		box.setItem(new Car());
	
		Car car = box.getItem();
		
		Box<Toy> tBox = new Box<Toy>();
		// tBox.setItem(new car());
		tBox.setItem(new Toy());
		Toy toy = tBox.getItem();
		
		Box<String> sBox = new Box<String>();
		sBox.setItem("문자열만 투입");
		String str = sBox.getItem()	;
	}

}

class Car{
	
}

class Toy{
	
}