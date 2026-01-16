package ex1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream03 {

	public static void main(String[] args) {

		String[] name = {"YOON", "CHO", "KIM", "PARK", "KIM", "CHO"};
		
		Stream<String> stream = Arrays.stream(name);
		
		int sum = stream
				.distinct()
				.mapToInt(s -> s.length())
				.sum();
		
		System.out.println(sum);
		
	}

}
