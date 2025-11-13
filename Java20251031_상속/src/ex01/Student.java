package ex01;


// Student 클래스는 Person 클래스를 상속받는다
public class Student extends Person{
	// private 정보 은닉 // 멤버 변수는 외부 노출 시키지 않는다!
	
	
	private String school;
	
	public Student(){} //디폴트 생성자
	public Student(String name, int age, String school){
		super(name, age);
		this.school = school;
	} // 인자 값 있는 생성자
	
	public void study() {
		System.out.println(school + "에서 공부 중 입니다.");
	}

	
}
