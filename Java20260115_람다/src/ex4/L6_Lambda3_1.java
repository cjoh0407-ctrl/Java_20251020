package ex4;

import java.util.function.Function;

//문자열을 넘겨주면 문자열 길이를 계산해서 반환

public class L6_Lambda3_1 {
  
	public static void main(String[] args) {
  
		Function<String, Integer> s1 = s -> s.length();
  
		int result = s1.apply("안녕하세요. 반갑습니다."); 
		System.out.println(result); 
	}
 
}
