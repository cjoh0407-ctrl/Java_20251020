package ex03;

abstract class Player{ //추상 클래스
	abstract void play (int pos) ; //추상 메소드
	abstract void stop(); //추상 메소드
	//메소드 오버라이딩을 강제화하기 위해서 사용한다.?
	// 오버라이딩에서 실수가 날까봐. 다형성을 처리하기 위해서.
	void func() {
		
	}
}

class AudioPlayer extends Player{
	@Override
	void play (int pos) {
		System.out.println("------AudioPlayer------");
	}
	
	@Override
	void stop() {
		//적절한 코드 입력
	}
}
	
class CDPlayer extends Player{

	@Override
	void play(int pos) {
		System.out.println("------CDPlayer------");
		
	}

	@Override
	void stop() {
		
	}
	
}

abstract class MyMyPlayer extends Player{
	
	@Override
	void play(int pos) {
		
	}
}
	
	
public class MainClass {

	public static void main(String[] args) {

//		1. 추상클래스는 객체 생성 불가
//		Player p1 = new Player();
		
		Player p = new AudioPlayer();
		p.play(1);
		
		p = new CDPlayer();
		p.play(1);
		
		// p = new MyMyPlayer();  abstract가 들어간 추상클래스라서 객체생성 불가능
	}

	
	
	// 추상클래스를 사용하는 이유는?
	// 공통된 기능, 특징은 물려주되 세부적인 부분에 대한 오버라이딩을 강제하기 위해서이다.
	// 강제화 하는 이유는, 오버라이딩에서 실수가 나도 알아차리기 쉽다.
	// 그리고 다형성을 처리하기 위해서?????
}
