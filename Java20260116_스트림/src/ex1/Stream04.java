package ex1;

import java.util.ArrayList;
import java.util.List;

class ToyPriceInfo{
	private String model;
	private int price;
	
	public ToyPriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}

public class Stream04 {

	public static void main(String[] args) {

		List<ToyPriceInfo> ls = new ArrayList<ToyPriceInfo>();
		ls.add(new ToyPriceInfo("GUN_LR 45", 200));
		ls.add(new ToyPriceInfo("TEDDY_BEAR_S 104", 300));
		ls.add(new ToyPriceInfo("CAR_TRANSFORM_VER_7719", 550));

		int sum = ls.stream()
						.filter(p -> p.getPrice()<500)
						.mapToInt(t -> t.getPrice())
						.sum();
		
		System.out.println(sum);
		
	}

}
