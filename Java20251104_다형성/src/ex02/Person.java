package ex02;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {} // 디폴트 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*
	 * public void showInfo() { 
	 * System.out.println("이름 : " + name + ", 나이 " + age); }
	 */
	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d\n", name, age);
			// %s : 문자열
			// %d : 정수
			// %f : 실수
			// %.2f	: 소수점 두 자리까지 출력.
			// \n : 줄바꿈
	}

}
