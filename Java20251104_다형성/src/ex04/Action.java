package ex04;

public interface Action {
	// interface는 상수만?
	public abstract void attack();
	void defend();
	
}

class Warrior implements Action{
	// interface에서 상속받고싶으면 implements
	
	@Override
	public void attack() {
		System.out.println("전사가 검으로 공격합니다.");
	}

	@Override
	public void defend() {
		System.out.println("전사가 방패로 막습니다.");
		
	} 
	
}

class Archer implements Action{

	@Override
	public void attack() {
		System.out.println("궁수가 화살을 쏩니다.");		
	}

	@Override
	public void defend() {
		System.out.println("궁수가 물러나 회피합니다.");
		
	}
	
}