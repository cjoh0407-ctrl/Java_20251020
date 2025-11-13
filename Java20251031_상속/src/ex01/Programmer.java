package ex01;

public class Programmer extends Person				{

	private String language;
	
	public Programmer() {}
	public Programmer(String name, int age, String language){
		super(name, age);
		this.language = language;
	}
	
	public void code() {
		System.out.println(language + "언어로 코딩 중 입니다.");
	}
}
