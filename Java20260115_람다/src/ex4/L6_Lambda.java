package ex4;

import java.util.function.Consumer;

interface Printable{
	void print();
}

class Papers{
	private String msg;
	public Papers(String msg) {
		this.msg = msg; 
	}
	
	public Printable getPrinter() {
		
		//람다 - 어차피 Printable interfacf를 구현한 구현체가 와야하니깐 
							//객체이름, 메서드 이름 다 지우고 사용함
		return () -> System.out.println(msg);
	}
}

public class L6_Lambda {

	public static void main(String[] args) {
		
		Papers p = new Papers("메시지 출력 요구!");
		Printable printer = p.getPrinter();
		printer.print();
		
		Consumer<String> msg = t -> System.out.println(t);
		msg.accept("메시지 출력 요구2!");
	}

}
