package ex5;

import java.util.function.Supplier;

/*
 * 정적 메소드 참조
 */
class RandomUtil{
	public static int coffee() {
		return (int)(Math.random()*13)+1;
	}
}

public class MethodRef2 {

	public static void main(String[] args) {

		Supplier<Integer> dice1 = ()->RandomUtil.coffee();
		
		System.out.println(dice1.get());
		
		Supplier<Integer> dice2 = RandomUtil::coffee;
		
		System.out.println(dice2.get());
	
	
	}

}
