package ex03;

// 타입 제한 : <T extends 상속받을 클래스 명>
// T 전달될 수 있는 객체는 상속받은 클래스이거나 그것의 하위 클래스
public class Box <T extends Person> {
	
	T item;
	
	void setItem(T item) {
		this.item = item;
	}
	
	T getItem() {
		return item;
	}
}


/* Car로 변경 완료// Car만 집어넣을 수 있다.
public class Box <Car> {
	
	Car item;
	
	void setItem(Car item) {
		this.item = item;
	}
	
	T getItem() {
		return item;
	}
}
*/


/* Toy로 변경 완료 // Toy 만 집어넣을 수 있다.
public class Box <Toy> {
	
	Toy item;
	
	void setItem(Toy item) {
		this.item = item;
	}
	
	Toy getItem() {
		return item;
	}
}
*/

/* String으로 변경 완료 // String 만 집어넣을 수 있다.
public class Box <String> {
	
	String item;
	
	void setItem(String item) {
		this.item = item;
	}
	
	String getItem() {
		return item;
	}
}
*/