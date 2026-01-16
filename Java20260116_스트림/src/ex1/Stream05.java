package ex1;

import java.util.ArrayList;
import java.util.List;

class ToyPriceInfo2{
	private String model;
	private int price;
	
	public ToyPriceInfo2(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}

public class Stream05 {

	public static void main(String[] args) {

		List<ToyPriceInfo2> ls = new ArrayList<>();
		ls.add(new ToyPriceInfo2("GUN_LR 45", 200));
		ls.add(new ToyPriceInfo2("TEDDY_BEAR_S 104", 300));
		ls.add(new ToyPriceInfo2("CAR_TRANSFORM_VER_7719", 550));

		ls.stream()
				.mapToInt(t -> t.getPrice())
				.sorted()
				.forEach(l -> System.out.println(l));
		
		// ---------------------------------------
		
		double result = ls.stream()
				.mapToInt(t -> t.getPrice())
				.sorted()
				.average()
				.getAsDouble();
		
		System.out.println(result);
		
		// ---------------------------------------
		
		int asInt = ls.stream()
				.mapToInt(t -> t.getPrice())
				.sorted()
				.max()
				.getAsInt();
		
		System.out.println(asInt);
		
		// -----------------------------------------
		
		ls.stream()
				.mapToInt(t -> t.getPrice())
				.sorted()
				.max()
				.ifPresent(mx -> System.out.println(mx));
		
		
	}

}
