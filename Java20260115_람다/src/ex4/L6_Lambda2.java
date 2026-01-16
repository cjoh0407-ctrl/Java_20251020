package ex4;

import java.util.function.BiFunction;

@FunctionalInterface
interface Adder{
	int add(int n1, int n2);
}

public class L6_Lambda2 {

	public static void main(String[] args) {
		
		Adder a1 = (n1, n2) -> n1+n2;
		
		int result = a1.add(2, 2);
		System.out.println(result);
		
		BiFunction<Integer, Integer, Double> f = (n1, n2) -> (double)n1*n2;
	
		double d1 = f.apply(5, 3);
		System.out.println(d1);
	}

}
