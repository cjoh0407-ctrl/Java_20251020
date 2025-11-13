package ex02;

public class Box <T> {
	
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