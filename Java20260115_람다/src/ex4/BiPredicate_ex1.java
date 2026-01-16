package ex4;

import java.util.function.BiPredicate;

public class BiPredicate_ex1 {

	public static void main(String[] args) {
		
		BiPredicate<String, String> login = (id, pw) -> 
			id.equals("admin") && pw.equals("1234") ? true : false;
			
		boolean lo = login.test("admin", "1234");
		
		if(lo == true) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패!");
		}
	}
}
