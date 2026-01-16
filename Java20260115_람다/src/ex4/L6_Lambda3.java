package ex4;

//문자열을 넘겨주면 문자열 길이를 계산해서 반환
//1. 클래스 구현체 만들어서 작동
//2. 익명클래스
//3. 람다

@FunctionalInterface
interface StringLength{ 
	int getLength(String s); 
}
  
class StringLengthImpl implements StringLength{
  
	@Override 
	public int getLength(String s) { 
  		return s.length(); 
  	}
  
} 
 
public class L6_Lambda3 {
  
	public static void main(String[] args) {
  
	  
	  // 일반
	  //StringLength s1 = new StringLengthImpl(); 
	  
		  
	  //2. 익명클래스로 변경
	  /*
	  StringLength s1 = new StringLength() {
			
			@Override
			public int getLength(String s) {
				return s.length();
			}
		}; 
	   */
  
  
		// 람다
		StringLength s1 = (s) -> s.length();
  
  
		int result = s1.getLength("안녕하세요. 반갑습니다."); 
		System.out.println(result); 
	}
 
}
