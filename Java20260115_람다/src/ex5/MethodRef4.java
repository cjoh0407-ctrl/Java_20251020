package ex5;

import java.util.function.Consumer;

/*
 * 인스턴스 메소드 참조
 */

public class MethodRef4 {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("java");
	
		Consumer<String> c2 = System.out::println;
		
		c2.accept("Spring");
	
	}

}
