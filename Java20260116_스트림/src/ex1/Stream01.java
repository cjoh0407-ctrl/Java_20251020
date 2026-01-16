package ex1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream01 {

	public static void main(String[] args) {

		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		
		IntStream stm1 = Arrays.stream(ar);
		
		IntStream stm2 = stm1.filter(i -> i % 2 == 0);
		
		IntStream stm3 = stm2.map(j -> j*2);
		
		int sum = stm3.sum();
		
		System.out.println(sum);
		
		
		// ///////////////////////////////
		
		
		IntStream st1 = Arrays.stream(ar);
		
		int result = st1
					.filter(i -> i % 2 == 0)
					.map(j -> j*2)
					.sum();
		
		System.out.println(result);
		
	}

}
