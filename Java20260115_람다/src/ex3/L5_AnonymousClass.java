package ex3;

interface Printable{
	void print();
}

class Papers{
	private String msg;
	public Papers(String msg) {
		this.msg = msg; 
	}
	
	public Printable getPrinter() {
		
		//익명 클래스 이름없는 클래스
		return new Printable(){
			
			@Override
			public void print() {
				System.out.println(msg);
			}
		};	
	}
}

public class L5_AnonymousClass {

	public static void main(String[] args) {
		
		Papers p1 = new Papers("이 문장을 출력하고 싶어!");
		Printable prn = p1.getPrinter();
		prn.print();
		
	}

}
