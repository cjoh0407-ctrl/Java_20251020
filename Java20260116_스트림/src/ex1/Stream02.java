package ex1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream02 {

	public static void main(String[] args) {

		String[] name = {"YOON", "CHO", "KIM", "PARK", "KIM", "CHO"};
		
		Stream<String> stream = Arrays.stream(name);
		
		stream
		.distinct()
		.forEach(i -> System.out.println(i));
		
	}

}
